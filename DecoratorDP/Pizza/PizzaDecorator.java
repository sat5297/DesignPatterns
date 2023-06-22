package Pizza;

public abstract class PizzaDecorator implements PizzaInterface{
    protected PizzaInterface decoratedPizza;

    public PizzaDecorator(PizzaInterface decoratedPizza){
        this.decoratedPizza = decoratedPizza;
    }
    
    public void makePizze(){
        decoratedPizza.makePizze();
    }
}
