public class Main {

    public static void main(String[] args) {
        FleetOfCars fleet = new FleetOfCars();

        Car F1Ferrari = new GasolineCar(40, "AZ 656 65", "Ferrari", "Formula 1 car", 0);
        Car W13 = new GasolineCar(19, "1234 89", "Mercedes", "Formula 1 car", 1);
        Car Tesla = new ElectricCar(100000, 648,"82139 128","Tesla","Sports car",4);
        Car DieselBandit = new DieselCar(50,true,"bt 7277 89", "Ford","Stationcar",5);

        //System.out.println(F1Ferrari.getRegistrationFee());
        //System.out.println(F1Ferrari);
        fleet.addCar(F1Ferrari);
        fleet.addCar(W13);
        fleet.addCar(Tesla);
        fleet.addCar(DieselBandit);
        //System.out.println(fleet.getTotalFee());
        //System.out.println(W13);
        System.out.println(fleet);
        System.out.println(fleet.getTotalFee());
    }
}
