package AbstractFactoryDP.Shape;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factoryType){
        if(factoryType.equalsIgnoreCase("Normal")){
            return new ShapeFactory();
        }
        else if(factoryType.equalsIgnoreCase("Rounded")){
            return new RoundedShapeFactory();
        }
        return new NULLFactory();
    }
}
