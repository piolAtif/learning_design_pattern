package ObserverPattern;

/**
 * Created by spreeti on 3/28/16.
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        subject.setState(14);
    }
}
