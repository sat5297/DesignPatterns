package AbstractFactoryDP.Shape;

public class NULLFactory extends AbstractFactory{
    
    @Override
    public Shape getShape(String shapeType){
        return new NULLObject();
    }
}
