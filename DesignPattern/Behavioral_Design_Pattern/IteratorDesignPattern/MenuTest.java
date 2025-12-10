package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;

public class MenuTest {
    public static void main(String[] args) {

        //To print all the menu from PancakeHouseMenu and DinerMenu in a single menu we need to call both
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();
        Waitress waitress=new Waitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenuWithoutIterator();
    }
}
