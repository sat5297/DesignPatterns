package Image;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        ImageInterface image = new ProxyImage("test.jpg");

        image.display();

        System.out.println();

        image.display();
    }
}
