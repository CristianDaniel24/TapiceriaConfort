package Proyecto.TapiceriaConfort;

import Proyecto.TapiceriaConfort.constants.EntityStorage;
import Proyecto.TapiceriaConfort.entities.*;

import java.util.Scanner;

public class Menu {

    private final Scanner scanner;

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


        //MENU PROVIDER
        boolean exit = false;
        while (!exit) {
            System.out.println("\nProvider Menu");
            System.out.println("1. Provide product");
            System.out.println("2. Supplier details");
            System.out.println("3. Exit");
            System.out.print("Enter an option: ");
            int result = scanner.nextInt();
            switch (result) {
                case 1:
                    provider.supplyProduct();
                    break;
                case 2:
                    System.out.println("Supplier details");
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }

    public void displayMenu(Customer customer) {
        //MENU CUSTOMER
        boolean exit = false;
        while (!exit) {
            System.out.println("\nCustomer Menu");
            System.out.println("1. Buy product");
            System.out.println("2. Request a service");
            System.out.println("3. Add item");
            System.out.println("4. Delete item");
            System.out.println("5. Show items");
            System.out.println("6. Exit");
            System.out.print("Enter an option: ");
            int result = scanner.nextInt();
            switch (result) {
                case 1:
                    customer.buyProduct();
                    break;
                case 2:
                    System.out.println("Enter the name of the service: ");
                    scanner.nextLine();
                    customer.setService(new Service());
                    customer.getService().setName(scanner.nextLine());
                    customer.requestService();
                    System.out.println("Service created");
                    customer.getService().displayDetails();
                    break;
                case 3:
                    scanner.nextLine();
                    System.out.println("Enter the product you want to add:");
                    String productoAgregado = scanner.nextLine();
                    Product producto = new Product(productoAgregado);
                    customer.getShoppingCart().addProduct(producto);
                    System.out.println("Adding Product...");
                    System.out.println("The product was added correctly");
                    System.out.println("The number of products in the cart are: " + customer.getShoppingCart().getProduct().size());
                    break;
                case 4:
                    scanner.nextLine();
                    if (customer.getShoppingCart().getProduct().isEmpty()) {
                        System.out.println("The cart is empty :(");
                        break;
                    }
                    System.out.println("Enter the product you want to delete");
                    String productName = scanner.nextLine();
                    boolean deletedProduct = false;
                    for (Product product : customer.getShoppingCart().getProduct()) {
                        if (product.getName().equals(productName)) {
                            customer.getShoppingCart().removeProduct(product);
                            deletedProduct = true;
                            break;
                        }
                    }
                    if (deletedProduct) {
                        System.out.println("The product has been successfully removed");
                    } else {
                        System.out.println("The product you want to delete does not exist or is invalid =(");
                    }
                    break;
                case 5:
                    scanner.nextLine();
                    if (customer.getShoppingCart().getProduct().isEmpty()) {
                        System.out.println("The cart is empty :(");
                    } else {
                        customer.displayDetails();
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid selection");
            }
        }
    }

    public void displayMenu(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWelcome " + employee.getName());
        boolean exit = false;
        while (!exit) {
            System.out.println("Select an option: ");
            System.out.println("1. View list of services");
            System.out.println("2. Perform service");
            System.out.println("3. Exit");

            String option = scanner.nextLine();
            switch (option) {
                case "1":
                    System.out.println("Look for the list of services");
                    EntityStorage.serviceStorage.findAll(new Service()).forEach(service -> {
                        System.out.println("Id: " + service.getId() + " -- " + "Name: " + service.getName() + " -- " + "Status: " + service.getStatus());
                    });
                    break;
                case "2":
                    System.out.println("Please enter the id of the service: ");
                    Long serviceId = Long.valueOf(scanner.nextLine());
                    employee.performService(serviceId);
                    break;
                case "3":
                    exit = true;
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
        }
    }
}