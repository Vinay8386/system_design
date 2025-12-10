package DesignPattern.Behavioral_Design_Pattern.IteratorDesignPattern;

import java.util.Iterator;

public interface Menu {
    public Iterator<MenuItem> createIterator();
}
