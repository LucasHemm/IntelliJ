abstract public class ACar implements Car{

    String registrationNumber;
    String make;
    String model;
    String numberOfDoors;

    @Override
    public String getRegistrationNumber() {
        return null;
    }

    @Override
    public String getMake() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getNumberOfDoors() {
        return 0;
    }
    /*
    @Override
    public int getRegistrationFee() {
        return 0;
    }
    */

    @Override
    public String toString() {
        return "Dette er en tostring inde i ACar";
    }
}

