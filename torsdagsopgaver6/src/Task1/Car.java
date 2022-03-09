package Task1;

public class Car {

    private String manufacturer;
    private String model;
    private int year;
    private String bodystyle;
    private Driver driver;

        public Car(String manufacturer, String model, int year, String bodystyle){
            this.manufacturer = manufacturer;
            this.model = model;
            this.year = year;
            this.bodystyle = bodystyle;
        }

    public Driver getDriver(){
        return this.driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }
}
