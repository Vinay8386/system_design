package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;

public class Waitress {

    private PancakeHouseMenu pancakeHouseMenu;
    private DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenuWithoutIterator() {
        System.out.println("MENU\n----\nBREAKFAST");
        printBreakfast();
        System.out.println("\nLUNCH");
        printLunch();
    }

    public void printBreakfast(){
        PancakeHouseMenu p =new PancakeHouseMenu();
        //To Iterate through the breakfast item, we use get() and (size() in case of normal for loop)method on the ArrayList
        for(MenuItem item:p.getMenuItems()){
            System.out.println(item.getName() + ": " + item.getDescription() + " $" + item.getPrice());
        }
    }

    public void printLunch(){
        DinerMenu d =new DinerMenu();
        //To iterate through the lunch items we use the Array length field and the array subscript notation on the MenuItem Array
        for(MenuItem item:d.getMenuItems()){
            System.out.println(item.getName() + ": " + item.getDescription() + " $" + item.getPrice());
        }
    }

    //In this case we will always need two different loop for two different restaurant.
    //In future if third restaurant will be merged with different implementation we need three loop than
         /*If the internal structure of either menu changes (e.g., replacing ArrayList with a LinkedList or changing the array implementation), the iteration logic in the MainClass must also be updated. This violates the Open/Closed Principle (OCP), where classes should be open for extension but closed for modification.
        Using the Iterator Design Pattern solves these problems by:
        Encapsulation: Encapsulating the traversal logic in an Iterator class.
        Polymorphism: Providing a common interface (Iterator) for all menus.
        Flexibility: Allowing the MainClass to iterate through menus without worrying about their underlying data structure.
        */
}
