package observer.pattern;

public interface ISubject {

    void register(IObserver o);
    void unregister(IObserver o);
    void notifyObservers(int i);
}
