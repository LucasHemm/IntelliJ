package Task1;

public class Main {

    public static void main(String[] args) {
        Driver driver1 = new Driver("Lucas", 21);
        Car car1 = new Car("Fiat", "Punto", 2009, "Mini-Cooper");
        car1.setDriver(driver1);
        System.out.println(car1 + "" + driver1);
        Car car2 = new Car("Mercedes", "EQXX", 2022, "Sportscar");
        car2.setDriver(driver1);
        System.out.println(car2 + "" + driver1);

    }
}
