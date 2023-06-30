package ObserverDP.Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First State change : 15");
        subject.setState(15);

        System.out.println("First State change : 10");
        subject.setState(10);
    }
}
