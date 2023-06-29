package AbstractFactoryDP.Shape;

public class AbstractFactoryDemo {
    
    public static void main(String[] args) {
        
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Normal");
        Shape shapeSquare = shapeFactory.getShape("Square");
        shapeSquare.draw();

        Shape shapeRectangle = shapeFactory.getShape("Rectangle");
        shapeRectangle.draw();

        Shape shapeTriangle = shapeFactory.getShape("Triangle");
        shapeTriangle.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory("Rounded");
        Shape roundedSquareShape = roundedShapeFactory.getShape("Square");
        roundedSquareShape.draw();

        Shape roundedRectangleShape = roundedShapeFactory.getShape("Rectangle");
        roundedRectangleShape.draw();

        Shape roundedTriangle = roundedShapeFactory.getShape("Triangle");
        roundedTriangle.draw();

        AbstractFactory cornedFactory = FactoryProducer.getFactory("Cornered");
        Shape cornShape = cornedFactory.getShape("Cored");
        cornShape.draw();
    }
}
