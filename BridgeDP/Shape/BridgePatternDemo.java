public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(10, 20, 12, new RedCircle());
        Shape greenCircle = new Circle(12, 24, 15, new GreenCircle());
        
        redCircle.draw();
        greenCircle.draw();
    }
}
