package Task3;

import java.util.ArrayList;

public class Main {

    static ArrayList<Customer> customers = new ArrayList<>();
    public static void main(String[] args){
        Customer customer1 = new Customer("Hans","Hansen", "Hansentheman");
        System.out.println(customer1);
        Customer customer2 = new Customer("peter", "Petersen", "Petersen5");
        Customer customer3 = new Customer("Kevin", "Kevinsen", "Kevinsen44");
        Customer customer4 = new Customer("Max", "Verstappen", "Verstappen33");
        Customer customer5 = new Customer("Charles", "Leclerc", "Leclerc16");
        Customer customer6 = new Customer("Lando", "Norris", "LN4");
        customers.add(customer1);
        customers.add(customer2);
        customers.add(customer3);
        customers.add(customer4);
        customers.add(customer5);
        customers.add(customer6);

        printCustomers();




    }
   public static void printCustomers(){
        for(Customer c : customers){
            System.out.println(c);
        }
   }

}
