package DesignPattern.Behavioral_Design_Pattern.Strategy.SortingStrategy;

import java.util.Arrays;
import java.util.List;

public class Client2_Code {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        //Create an object of context class
        SortingContext context = new SortingContext();

        context.setSortStrategy(new BubbleSort()); // Switch to BubbleSort

        context.executeSort(numbers);
    }
}
