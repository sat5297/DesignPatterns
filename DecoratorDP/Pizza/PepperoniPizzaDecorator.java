package Pizza;

public class PepperoniPizzaDecorator extends PizzaDecorator{
    
    public PepperoniPizzaDecorator(PizzaInterface decoratedPizza){
        super(decoratedPizza);
    }

    @Override
    public void makePizze(){
        decoratedPizza.makePizze();
        addPepperoni(decoratedPizza);
    }

    private void addPepperoni(PizzaInterface decoratedPizza){
        System.out.println("Pizza : Pepperoni Toppings");
    }
}
