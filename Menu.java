package Proyecto.TapiceriaConfort;

import Proyecto.TapiceriaConfort.entities.Customer;
import Proyecto.TapiceriaConfort.entities.Employee;
import Proyecto.TapiceriaConfort.entities.Provider;

import java.util.Scanner;

public class Menu {

    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMainMenu() {
        System.out.println("Welcome to TP console V0.0Beta");
        System.out.println("  _____ ____                              _      \n" +
                " |_   _|  _ \\    ___ ___  _ __  ___  ___ | | ___ \n" +
                "   | | | |_) |  / __/ _ \\| '_ \\/ __|/ _ \\| |/ _ \\\n" +
                "   | | |  __/  | (_| (_) | | | \\__ \\ (_) | |  __/\n" +
                "   |_| |_|      \\___\\___/|_| |_|___/\\___/|_|\\___|\n" +
                "                                                 ");

    }

    public void displayMenu(Provider provider) {
        System.out.println("Provider menu " + provider.getName());
    }

    public void displayMenu(Customer customer) {
        System.out.println("Customer menu: " + customer.getName());

    }

    public void displayMenu(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome " + employee.getName());
        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option: ");
            System.out.println("    1. View list of services");
            System.out.println("    2. Perform service");
            System.out.println("    3. Exit");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Look for the list of services");
                    break;
                case "2":
                    System.out.println("Please enter the id of the service: ");
                    Long serviceId = scanner.nextLong();
                    employee.performService(serviceId);
                    break;
                default:
                    exit = true;
            }
        }
    }

}
