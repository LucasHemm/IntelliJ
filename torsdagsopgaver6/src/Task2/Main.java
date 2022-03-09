package Task2;

import java.util.ArrayList;

public class Main {
    static ArrayList<Room> roomsList = new ArrayList<>();
    public static void main(String[] args){
        System.out.println("hello world");
        Room room1 = new Room(4,2,3,4);
        Room room2 = new Room(3,3,3,3);
        Room room3 = new Room(4,1,2,6);
        roomsList.add(room1);
        roomsList.add(room2);
        roomsList.add(room3);
        Building building1 = new Building(roomsList,2,5,true);
        System.out.println(building1.getRooms().get(0).getNumberOfWindows() + building1.getRooms().get(1).getNumberOfWindows() + building1.getRooms().get(2).getNumberOfWindows());
        int floorNum = building1.getNumberOfFloors();
        int roomAmount = roomsList.size();
        System.out.println(roomAmount);
        if(floorNum > roomAmount){
            System.out.println("This is an odd building");
        }

    }
}
