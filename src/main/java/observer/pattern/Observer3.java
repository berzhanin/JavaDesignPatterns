package observer.pattern;

/**
 * Description:
 *
 * @author DmitryBerzhanin
 * @date 4/27/2022
 */
public class Observer3 implements IObserver{
    @Override
    public void update(int i){
        System.out.println("Observer3: myValue in Subject is now: "+i);
    }
}
