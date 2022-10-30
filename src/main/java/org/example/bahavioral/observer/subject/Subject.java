package org.example.bahavioral.observer.subject;

import org.example.bahavioral.observer.observer.Observer;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
