package Proyecto.TapiceriaConfort;

import Proyecto.TapiceriaConfort.entities.Customer;
import Proyecto.TapiceriaConfort.entities.Employee;
import Proyecto.TapiceriaConfort.entities.Person;
import Proyecto.TapiceriaConfort.entities.Provider;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        // TODO: INITIALIZE DATA
        personList.add(new Customer("demo", "demo@d.com", 123, 1L));
        
        Menu menu = new Menu(scanner);
        menu.displayMainMenu();

        boolean exit = false;
        while (!exit) {
            System.out.println("Please enter your email: ");
            String email = scanner.nextLine();
            Optional<Person> personSearch = personList.stream().filter(person -> person.getEmail().equals(email)).findFirst();
            if (personSearch.isPresent()) {
                System.out.println("person valid");
                Person person = personSearch.get();
                switch (person) {
                    case Customer customer -> menu.displayCustomerMenu();
                    case Employee employee -> menu.displayEmployeeMenu();
                    case Provider provider -> menu.displayProviderMenu();
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