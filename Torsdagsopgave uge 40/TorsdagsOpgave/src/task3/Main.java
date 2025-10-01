package task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(3, 2);
        Room room2 = new Room(5, 0);
        Room room3 = new Room(1, 6);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(2, rooms);
        Building building2 = new Building(4, rooms);

        System.out.println("Total number of lamps in building 1: " + countLampsInBuilding(building1));
        System.out.println("Total number of rooms in building 1: " + countRoomsInBuilding(building1));
        System.out.println("Is the number of floors in building 1 less or equal to the number of rooms: " + isNormal(building1));
        System.out.println("Is the number of floors in building 2 less or equal to the number of rooms: " + isNormal(building2));
    }

    static int countLampsInBuilding(Building building) {
       int total = 0;
        for (Room room : building.getRooms()) {
            total += room.getNumberOfLamps();
        }
        return total;
    }

    static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() <= building.getRooms().size()) {
            return true;
        } else {
            return false;
        }
    }
}
