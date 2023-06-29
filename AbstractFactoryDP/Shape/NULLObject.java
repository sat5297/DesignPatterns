package AbstractFactoryDP.Shape;

public class NULLObject implements Shape{
    
    @Override
    public void draw(){
        System.out.println("NULL Object cannot draw");
    }
}
