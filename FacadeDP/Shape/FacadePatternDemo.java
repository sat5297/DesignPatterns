package Shape;

public class FacadePatternDemo {
    public static void main(String[] args) {
        
        FacadeClass facade = new FacadeClass();

        facade.drawCircle();
        facade.drawRectangle();
        facade.drawSquare();
    }
}
