// File: library/models/Book.java
package library.models;

public class Book {
    private String id;
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}

// File: library/models/User.java
package library.models;

public class User {
    private String id;
    private String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

// File: library/services/LibraryService.java
package library.services;

import library.models.Book;
import java.util.List;

public interface LibraryService {
    void addBook(Book book);
    void removeBook(String bookId);
    void borrowBook(String userId, String bookId);
    void returnBook(String userId, String bookId);
    List<Book> getAvailableBooks();
}

// File: library/services/LibraryServiceImpl.java
package library.services;

import library.models.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class LibraryServiceImpl implements LibraryService {
    private final List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    @Override
    public void removeBook(String bookId) {
        books.removeIf(book -> book.getId().equals(bookId));
        System.out.println("Book removed with ID: " + bookId);
    }

    @Override
    public void borrowBook(String userId, String bookId) {
        Optional<Book> bookOpt = books.stream()
                .filter(book -> book.getId().equals(bookId) && book.isAvailable())
                .findFirst();

        if (bookOpt.isPresent()) {
            bookOpt.get().setAvailable(false);
            System.out.println("User " + userId + " borrowed book: " + bookOpt.get());
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    @Override
    public void returnBook(String userId, String bookId) {
        Optional<Book> bookOpt = books.stream()
                .filter(book -> book.getId().equals(bookId) && !book.isAvailable())
                .findFirst();

        if (bookOpt.isPresent()) {
            bookOpt.get().setAvailable(true);
            System.out.println("User " + userId + " returned book: " + bookOpt.get());
        } else {
            System.out.println("Book was not borrowed or does not exist.");
        }
    }

    @Override
    public List<Book> getAvailableBooks() {
        List<Book> availableBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.isAvailable()) {
                availableBooks.add(book);
            }
        }
        return availableBooks;
    }
}

// File: Main.java
import library.models.Book;
import library.models.User;
import library.services.LibraryService;
import library.services.LibraryServiceImpl;

public class Main {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryServiceImpl();

        Book book1 = new Book("1", "The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("2", "1984", "George Orwell");
        Book book3 = new Book("3", "To Kill a Mockingbird", "Harper Lee");
        
        User user1 = new User("U1", "Alice");

        libraryService.addBook(book1);
        libraryService.addBook(book2);
        libraryService.addBook(book3);

        libraryService.borrowBook(user1.getId(), "1");
        System.out.println("Available books: " + libraryService.getAvailableBooks());

        libraryService.returnBook(user1.getId(), "1");
        System.out.println("Available books after return: " + libraryService.getAvailableBooks());
    }
}
