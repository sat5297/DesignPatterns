package Pizza;

public class JalapenoPizzaDecorator extends PizzaDecorator{
    
    public JalapenoPizzaDecorator(PizzaInterface decoratedPizza){
        super(decoratedPizza);
    }
    
    @Override
    public void makePizze(){
        decoratedPizza.makePizze();
        addJalapeno(decoratedPizza);
    }

    private void addJalapeno(PizzaInterface decoratedPizza){
        System.out.println("Pizza : Jalapeno Toppings");
    }
}
