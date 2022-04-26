package observer.pattern;

/**
 * Description:
 *
 * @author DmitryBerzhanin
 * @date 4/26/2022
 */
public class Observer1 implements IObserver{
    @Override
    public void update(int i){
        System.out.println("Observer1: myValue in Subject is now: "+i);
    }
}
