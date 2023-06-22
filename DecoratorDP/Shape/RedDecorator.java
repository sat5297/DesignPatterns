package Shape;

public class RedDecorator extends ShapeDecorator{
    
    public RedDecorator(ShapeInterface decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedDecorator();
    }

    private void setRedDecorator(){
        System.out.println("Border : Color Red...!!!");
    }
}
