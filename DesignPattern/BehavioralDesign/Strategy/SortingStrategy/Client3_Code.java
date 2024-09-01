package DesignPattern.BehavioralDesign.Strategy.SortingStrategy;

import java.util.Arrays;
import java.util.List;

public class Client3_Code {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 3);

        //Create an object of context class
        SortingContext context = new SortingContext();

        context.setSortStrategy(new MergeSort()); // Switch to MergeSort

        context.executeSort(numbers);
    }
}
