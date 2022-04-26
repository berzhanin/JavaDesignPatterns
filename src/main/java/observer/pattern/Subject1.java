package observer.pattern;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author DmitryBerzhanin
 * @date 4/26/2022
 */
@Getter
public class Subject1 implements ISubject {

    List<IObserver> observers = new ArrayList<>();
    private int flag;

    public void setValue(int myValue) {
        this.flag = flag;

        //flag value changed. So notify observer(s)
        notifyObservers(myValue);
    }

    @Override
    public void register(IObserver o) {
        observers.add(o);
    }

    @Override
    public void unregister(IObserver o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(int updateValue) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(updateValue);
        }
    }
}
