package observer.pattern;

/**
 * Description:
 *
 * @author DmitryBerzhanin
 * @date 4/27/2022
 */
public class Observer2 implements IObserver{
    @Override
    public void update(int i){
        System.out.println("Observer2: myValue in Subject is now: "+i);
    }
}
