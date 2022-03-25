abstract public class ACar implements Car{

    private final String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors){
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getRegistrationNumber() {
        return this.registrationNumber;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getNumberOfDoors(){
        return this.numberOfDoors;
    }

    @Override
    public String toString() {
        return "Registration number: " + registrationNumber + "\nMake: " + make + "\nModel: " + model + "\nNumber of doors: " + numberOfDoors;
    }
}

