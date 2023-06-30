package ObserverDP.ChatNotificationObserver;

public class ChatPatternObserverDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new LaptopObserver(subject);
        new MobileObserver(subject);

        System.out.println("First State : Hello");
        subject.setState("Hello");

        System.out.println("First State : Hey There..!!");
        subject.setState("Hey There..!!");
    }
}
