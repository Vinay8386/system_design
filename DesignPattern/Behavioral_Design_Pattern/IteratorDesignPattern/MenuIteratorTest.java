package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;

public class MenuIteratorTest {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu=new PancakeHouseMenu();
        DinerMenu dinerMenu=new DinerMenu();

        NewWaitress waitress=new NewWaitress(pancakeHouseMenu,dinerMenu);
        waitress.printMenu2();
    }
}
