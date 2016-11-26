package ObserverPattern;

/**
 * Created by spreeti on 3/28/16.
 */
public class HexObserver implements Observer {
    private final Subject subject;

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String "+Integer.toHexString(subject.getState()));
    }
}
