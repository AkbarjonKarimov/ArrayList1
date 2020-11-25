package com.akbar;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item)
    {
        groceryList.add(item);
    }
    public void printGroceryList()
    {
        System.out.println("You have "+groceryList.size()+" items in your groceryList");
        for(int i=0;i<groceryList.size();i++)
        {
            System.out.println((i+1)+", "+groceryList.get(i));
        }
    }

    public void modifyGroceryListItem(int position,String newItem)
    {
        groceryList.set(position,newItem);
        System.out.println("Grocery item "+(position+1)+" has ben modified");
    }

    public void removeGroceryItem(int position)
    {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findGroceryItem(String searchItem)
    {
        int position = groceryList.indexOf(searchItem);
        if(position>=0)
        {
            return groceryList.get(position);
        }


        return null;
    }
}
