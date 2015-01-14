package com.raphael.pkg;

/**
 * Created by Nov on 2015/1/14.
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
