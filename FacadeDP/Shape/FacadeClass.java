package Shape;

public class FacadeClass {
    private ShapeInterface circle;
    private ShapeInterface square;
    private ShapeInterface rectangle;

    public FacadeClass(){
        circle = new Circle();
        square = new Square();
        rectangle = new Rectangle();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
