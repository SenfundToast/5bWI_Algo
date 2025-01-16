package at.bma.algorithms;

import java.util.Scanner;

public class Interface {
    private int[] arrayToSort = DataGenerator.generateDataArray(5, 1, 5);
    private Scanner scanner = new Scanner(System.in);
    private boolean isGoing = true;

    public void run() {
        while (isGoing) {
            System.out.println("\nEnter a number to make the following actions:");
            System.out.println("1 - Choose a sorting algorithm");
            System.out.println("2 - Execute a sorting operation");
            System.out.println("3 - Create random list of length n");
            System.out.println("4 - Exit program");
            
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Choose sorting algorithm (not implemented yet)");
                    break;
                case 2:
                    System.out.println("Execute sorting (not implemented yet)");
                    break;
                case 3:
                    System.out.println("Enter length:");
                    int length = scanner.nextInt();
                    arrayToSort = DataGenerator.generateDataArray(length, 1, 1000);
                    System.out.println("Created new random list:");
                    DataGenerator.printArray(arrayToSort);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    isGoing = false;
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}
