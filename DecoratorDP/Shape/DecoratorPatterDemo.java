package Shape;

public class DecoratorPatterDemo {
    public static void main(String[] args) {
        ShapeInterface circle = new Circle();
        circle.draw();
        System.out.println();

        ShapeInterface redCircle = new RedDecorator(new Circle());
        redCircle.draw();

        ShapeInterface rectangle = new Rectangle();
        rectangle.draw();

        ShapeInterface blueRectangle = new BlueDecorator(new Rectangle());
        blueRectangle.draw();
    }    
}
