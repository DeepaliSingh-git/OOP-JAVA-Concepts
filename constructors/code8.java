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
    public void displayBuildingInfo() {
        super.displayBuildingInfo();
        System.out.println("Number of Bedrooms: " + numberOfBedrooms);
        System.out.println("Number of Bathrooms: " + numberOfBathrooms);
    }
}
public class BuildingDemo {
    public static void main(String[] args) {
    
        House house = new House(3, 10, 2500.0, 4, 3);
        house.displayBuildingInfo();
    }
}
