package Proyecto.TapiceriaConfort;

import Proyecto.TapiceriaConfort.constants.StorageConstants;
import Proyecto.TapiceriaConfort.entities.Customer;
import Proyecto.TapiceriaConfort.entities.Employee;
import Proyecto.TapiceriaConfort.entities.Person;
import Proyecto.TapiceriaConfort.entities.Provider;
import Proyecto.TapiceriaConfort.storage.GenericStorage;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        GenericStorage<Employee> employeeStorage = new GenericStorage<>(StorageConstants.EMPLOYEE_STORAGE);
        List<Person> personList = new LinkedList<>(employeeStorage.load(new Employee()));

        GenericStorage<Customer> customerStorage = new GenericStorage<>(StorageConstants.CUSTOMER_STORAGE);
        personList.addAll(customerStorage.load(new Customer()));

        GenericStorage<Provider> providerStorage = new GenericStorage<>(StorageConstants.PROVIDER_STORAGE);
        personList.addAll(providerStorage.load(new Provider()));

        Menu menu = new Menu(scanner);
        menu.displayMainMenu();

        boolean exit = false;
        while (!exit) {
            System.out.println("Please enter your email: ");
            String email = scanner.nextLine();
            Optional<Person> personSearch = personList.stream().filter(Objects::nonNull).filter(person -> person.getEmail().equals(email)).findFirst();
            if (personSearch.isPresent()) {
                Person person = personSearch.get();
                switch (person) {
                    case Customer customer -> menu.displayMenu(customer);
                    case Employee employee -> menu.displayMenu(employee);
                    case Provider provider -> menu.displayMenu(provider);
                    default -> {
                    }
                }
                exit = true;
            } else {
                System.out.println("User not found.\n");
                System.out.println("Select an option: ");
                System.out.println("    1. Try again");
                System.out.println("    2. Exit");
                String option = scanner.nextLine();
                if (!option.equals("1")) {
                    exit = true;
                }
            }
        }
    }
}