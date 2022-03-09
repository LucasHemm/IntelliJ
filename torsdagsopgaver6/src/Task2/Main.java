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
        Building building1 = new Building(roomsList,2,3,true);
        

    }
}
