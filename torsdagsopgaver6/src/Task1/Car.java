package Task1;

public class Car {

    private String manufacturer;
    private String model;
    private int year;
    private String bodyStyle;
    private Driver driver;

        public Car(String manufacturer, String model, int year, String bodyStyle){
            this.manufacturer = manufacturer;
            this.model = model;
            this.year = year;
            this.bodyStyle = bodyStyle;
        }

    public Driver getDriver(){
        return this.driver;
    }

    public void setDriver(Driver driver){
        this.driver = driver;
    }

    @Override
    public String toString(){
       return "Manufacturer: "+ manufacturer +". Model: "+model+ " ("+ year + "), BodyStyle: " + bodyStyle;
    }
}
