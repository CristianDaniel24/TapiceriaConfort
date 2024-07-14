package Proyecto.TapiceriaConfort;

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

    public void displayProviderMenu() {
        System.out.println("Provider menu");
    }

    public void displayCustomerMenu() {
        System.out.println("Customer menu");

    }

    public void displayEmployeeMenu() {
        System.out.println("Employee menu");
    }

}
