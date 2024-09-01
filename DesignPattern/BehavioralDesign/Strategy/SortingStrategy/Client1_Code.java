package DesignPattern.BehavioralDesign.Strategy.SortingStrategy;

import java.util.Arrays;
import java.util.List;

public class Client1_Code {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        //Create an object of context class
        SortingContext context = new SortingContext();

        context.setSortStrategy(new QuickSort()); // Switch to QuickSort

        context.executeSort(numbers); // execute the sorting
    }
}
