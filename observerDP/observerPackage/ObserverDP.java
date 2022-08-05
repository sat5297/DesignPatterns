package observerPackage;

public class ObserverDP {
    public static void main(String[] args) {
        group g = new group();
        subscriber s1 = new subscriber(0);
        subscriber s2 = new subscriber(1);
        subscriber s3 = new subscriber(2);
        g.subscribe(s1);
        g.subscribe(s2);
        g.subscribe(s3);
        g.notify("Hello!! Subscribing ");
        g.unsubscribe(s2);
        g.notify("Hello!! updated ");
    }
}
