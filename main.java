package Proyecto.TapiceriaConfort;

import Proyecto.TapiceriaConfort.entities.Customer;
import Proyecto.TapiceriaConfort.entities.Employee;
import Proyecto.TapiceriaConfort.entities.Provider;

import java.util.ArrayList;
public class main {
    public static void main(String[] args) {
        ArrayList<Provider> providers = new ArrayList<>();
        providers.add(new Provider("Carlos","carlosgutierrez234@gmail.com",
                300346912,"TelaMax","Calle 14 #34-21"));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Valentina","valentinaalvarez200@gmail.com",
                320345924,"Tapisado de sillas",1500000.0));

        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Juan","juansuarez324@gmail.com",
                311345902,1));
        for (Provider provider : providers){
            provider.detailsProvider();
            provider.supplyProduct();
            System.out.println(" ");
        }
        for (Employee employee : employees){
            employee.detailsEmployee();
            employee.detailsEmployee();
            System.out.println(" ");
        }
        for (Customer customer : customers){
            customer.detailsCustomer();
            customer.buyProduct();
            customer.requestService();
            System.out.println(" ");
        }
    }
}