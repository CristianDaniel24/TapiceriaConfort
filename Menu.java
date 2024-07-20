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
            System.out.println("\nMenu del Proveedor");
            System.out.println("1. Proveer producto");
            System.out.println("2. Detalles del proveedor");
            System.out.println("3. Exit");
            System.out.print("Ingresa una opcion: ");
            int resultado = scanner.nextInt();
            switch (resultado) {
                case 1:
                    provider.supplyProduct();
                    break;
                case 2:
                    System.out.println("Detalles del proveedor");
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccion invalida");
            }
        }
    }

    public void displayMenu(Customer customer) {
        //MENU CUSTOMER
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu del Cliente");
            System.out.println("1. Comprar producto");
            System.out.println("2. Solicitar un servicio");
            System.out.println("3. Agregar item");
            System.out.println("4. Eliminar item");
            System.out.println("5. Mostrar los items");
            System.out.println("6. Exit");
            System.out.print("Ingresa una opcion: ");
            int resultado = scanner.nextInt();
            switch (resultado) {
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
                    System.out.println("Agregando Producto...");
                    System.out.println("Ingresa el producto que desas agregar:");
                    String productoAgregado = scanner.nextLine();
                    Product producto = new Product(productoAgregado);
                    customer.getShoppingCart().addProduct(producto);
                    System.out.println("El producto fue agregado correctamnete");
                    System.out.println("La cantidad de productos del carrito son: " + customer.getShoppingCart().getProduct().size());
                    break;
                case 4:
                    scanner.nextLine();
                    System.out.println("Eliminando Producto..");
                    System.out.println("Ingresa el producto que deseas eliminar");
                    String productoEliminado = scanner.nextLine();
                    Product product = new Product(productoEliminado);
                    customer.getShoppingCart().removeProduct(product);
                    System.out.println("El producto fue eliminado con exito");
                    System.out.println("La cantidad de productos restantes del carrito son: " + customer.getShoppingCart().getProduct().size());
                    break;
                case 5:
                    scanner.nextLine();
                    if (customer.getShoppingCart().getProduct().size() > 0) {
                        for (int i = 0; i < customer.getShoppingCart().getProduct().size(); i++) {
                            System.out.println(customer.getShoppingCart().getProduct().get(i));
                        }
                    } else {
                        System.out.println("El carrito esta vacio :(");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccion invalida");
            }
        }
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
