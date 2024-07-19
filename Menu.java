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
            System.out.println("3. Exit");
            System.out.print("Ingresa una opcion: ");
            int resultado = scanner.nextInt();
            switch (resultado) {
                case 1:
                    customer.buyProduct();
                    break;
                case 2:
                    customer.requestService();
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Seleccion invalida");
            }
        }
    }

    public void displayMenu(Employee employee) {
        System.out.println("Employee menu: " + employee.getName());
    }

}
