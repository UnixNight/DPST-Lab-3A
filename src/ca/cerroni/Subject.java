package ca.cerroni;

public interface Subject {

    void register(Observer o);
    void remove(Observer o);
    void notifyObserver();

}
