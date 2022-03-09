package Task2;

public class Room {

    private int walls;
    private int numberOfDoors;
    private int numberOfLamps;
    private int numberOfWindows;

    public Room(int walls, int numberOfDoor, int numberOfLamps, int numberOfWindows){
        this.walls = walls;
        this.numberOfDoors = numberOfDoor;
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    public int getWalls(){
        return this.walls;
    }
    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public int getNumberOfLamps(){
        return numberOfLamps;
    }
    public int getNumberOfWindows(){
        return numberOfWindows;
    }




}
