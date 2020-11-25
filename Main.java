package com.akbar;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList =new GroceryList();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstruction();
        while (!quit)
        {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice)
            {
                case 0:
                    printInstruction();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
    public static void printInstruction()
    {
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice option");
        System.out.println("\t 1 - To print list of grocery Item");
        System.out.println("\t 2 - To add new Item for groceryList");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item in the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quit the application");
    }

    public static void addItem()
    {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem()
    {
        System.out.println("Please enter item number ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter replacement item ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryListItem(itemNo-1,newItem);
    }
    public static void removeItem()
    {
        System.out.println("Please enter remove Item ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem()
    {
        System.out.println("Please enter item to search for ");
        String searchItem = scanner.nextLine();
        if(groceryList.findGroceryItem(searchItem)!=null)
        {
            System.out.println("Found "+searchItem+" in our groceryList");
        }else {
            System.out.println(searchItem+" Item not found in the groceryList");
        }
    }

}
