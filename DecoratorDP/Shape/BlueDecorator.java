package Shape;

public class BlueDecorator extends ShapeDecorator {

    public BlueDecorator(ShapeInterface decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setBlueDecorator();
    }

    private void setBlueDecorator(){
        System.out.println("Border : Color Blue...!!!");
    }
    
}
