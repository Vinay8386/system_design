package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;


import java.util.Iterator;

//NewWaitress interacts with multiple menus and presents their combined data in a unified format.
public class NewWaitress {
    /*private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;*/
    private Menu pancakeHouseMenu;
    private Menu dinerMenu;

    public NewWaitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu2() {
        System.out.println("MENU\n----\nBREAKFAST");
        printMenu2(pancakeHouseMenu.createIterator());
        System.out.println("\nLUNCH");
        printMenu2(dinerMenu.createIterator());
    }

    private void printMenu2(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + ": " + menuItem.getDescription() + " $" + menuItem.getPrice());
        }
    }
}
