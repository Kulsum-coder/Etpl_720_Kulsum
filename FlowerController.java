package com.evergent.corejava.store.collection;

import java.util.Scanner;

import com.evergent.corejava.store.service.FlowerService;

public class FlowerController {
    public static void main(String[] args) {
        FlowerService flowerService = new FlowerService();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("1. Add New Flower");
            System.out.println("2. Show Flower Inventory");
            System.out.println("3. Purchase Flower");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter Flower ID: ");
                    int flowerId = scanner.nextInt();
                    System.out.print("Enter Flower Name: ");
                    String flowerName = scanner.next();
                    System.out.print("Enter Quantity: ");
                    int quantity = scanner.nextInt();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    flowerService.addFlower(flowerId, flowerName, quantity, price);
                    break;
                case 2:
                    flowerService.showInventory();
                    break;
                case 3:
                    System.out.print("Enter Flower ID to Purchase: ");
                    flowerId = scanner.nextInt();
                    System.out.print("Enter Quantity: ");
                    quantity = scanner.nextInt();
                    flowerService.purchaseFlower(flowerId, quantity);
                    break;
                case 4:
                    System.out.println("Thank you for using Flower Store!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
        
        scanner.close();
    }
}
