package DesignPattern.BehavioralDesign.Strategy.SortingStrategy;

import java.util.List;

//Responsible class to delegate task to Strategy interface. Act as an interface between client and strategy
public class SortingContext {

    //Create a reference to SortStrategy interface
    private SortStrategy sortStrategy;

    //Method, through which a client can set appropriate strategy as per requirements
    public void setSortStrategy(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    //Method, through which client can execute sorting
    public void executeSort(List<Integer> numbers) {
        sortStrategy.sort(numbers);
    }
}
