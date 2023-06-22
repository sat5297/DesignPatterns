package Shape;

public abstract class ShapeDecorator implements ShapeInterface{
    protected ShapeInterface decoratedShape;

    ShapeDecorator(ShapeInterface decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
