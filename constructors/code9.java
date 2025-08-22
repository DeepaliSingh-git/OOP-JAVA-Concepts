class Building {
    int numberOfFloors;
    int numberOfRooms;
    double totalFootage;

    public Building(int numberOfFloors, int numberOfRooms, double totalFootage) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRooms = numberOfRooms;
        this.totalFootage = totalFootage;
    }

    public void displayBuildingInfo() {
        System.out.println("Building Details:");
        System.out.println("Number of Floors: " + numberOfFloors);
        System.out.println("Number of Rooms: " + numberOfRooms);
        System.out.println("Total Footage: " + totalFootage + " sq ft");
    }
}

class House extends Building {
    int numberOfBedrooms;
    int numberOfBathrooms;

    public House(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfBedrooms, int numberOfBathrooms) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.numberOfBedrooms = numberOfBedrooms;
        this.numberOfBathrooms = numberOfBathrooms;
    }

    @Override
    public void displayBuildingInfo() {
        super.displayBuildingInfo();
        System.out.println("Number of Bedrooms: " + numberOfBedrooms);
        System.out.println("Number of Bathrooms: " + numberOfBathrooms);
    }
}

class Office extends Building {
    int numberOfTelephones;
    int numberOfTables;

    public Office(int numberOfFloors, int numberOfRooms, double totalFootage, int numberOfTelephones, int numberOfTables) {
        super(numberOfFloors, numberOfRooms, totalFootage);
        this.numberOfTelephones = numberOfTelephones;
        this.numberOfTables = numberOfTables;
    }

    @Override
    public void displayBuildingInfo() {
        super.displayBuildingInfo();
        System.out.println("Number of Telephones: " + numberOfTelephones);
        System.out.println("Number of Tables: " + numberOfTables);
    }
}

public class BuildingDemo {
    public static void main(String[] args) {
        House house = new House(3, 10, 2500.0, 4, 3);
        Office office = new Office(5, 20, 5000.0, 30, 15);

        house.displayBuildingInfo();
        System.out.println();
        office.displayBuildingInfo();
    }
}
