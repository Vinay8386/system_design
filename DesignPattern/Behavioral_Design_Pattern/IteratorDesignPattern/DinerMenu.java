package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;

import java.util.Iterator;

//Implemented in array
public class DinerMenu implements Menu{
    private static final int MAX_ITEMS = 4; // Fixed size
    private int numberOfItems = 0;
    private MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS]; // Initialize the array

        // Add some default menu items
        addItem("Vegetarian BLT", "(Fakin') Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "Soup of the day, with a side of potato salad", false, 3.29);
        addItem("Hotdog", "A hot dog, with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry, menu is full! Can't add item to menu");
        } else {
            MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
            menuItems[numberOfItems] = menuItem; // Add the item to the array
            numberOfItems++;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems; // Return the array of menu items
    }

    //After implementing below method, above getMenuItem is no more usable
    //Below approach creates a custom Iterator (DinerMenuIterator) that directly iterates over the menuItems array.
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menuItems);
    }
    //other menu method here
}
