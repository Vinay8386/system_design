package DesignPattern.Behavioral_Design_Pattern.Strategy.SortingStrategy;

import java.util.List;

//This is a strategy interface
interface SortStrategy {
    void sort(List<Integer> numbers);
}
