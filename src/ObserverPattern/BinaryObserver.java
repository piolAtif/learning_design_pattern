package ObserverPattern;

/**
 * Created by spreeti on 3/28/16.
 */
public class BinaryObserver implements Observer{
    private Subject subject;

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String :"+Integer.toBinaryString(subject.getState()));
    }
}
