public class ElectricCar extends ACar {

    int batterCapacity;
    int maxRange;

    public int getBatteryCapacityKWh(){
        return 1;
    }

    public int getMaxRangeKm(){
        return 1;
    }

    public int getWhPrKm(){
        return 1;
    }



    @Override
    public int getRegistrationFee() {
        return 0;
    }

    @Override
    public String toString() {
        return "Dette er en tostring inde i ElectricCar";
    }
}
