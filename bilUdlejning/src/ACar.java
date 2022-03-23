abstract public class ACar implements Car{

    String registrationNumber;
    String make;
    String model;
    String numberOfDoors;

    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    String toString();

    }
