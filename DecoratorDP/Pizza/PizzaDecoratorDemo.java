package Pizza;

public class PizzaDecoratorDemo {
    public static void main(String[] args) {
        PizzaInterface onionPizza = new OnionPizza();
        onionPizza.makePizze();

        PizzaInterface tomatoPizza = new TomatoPizza();
        tomatoPizza.makePizze();

        PizzaInterface jalapenoOnionPizza = new JalapenoPizzaDecorator(new OnionPizza());
        jalapenoOnionPizza.makePizze();

        PizzaInterface pepperoniOnionPizza = new PepperoniPizzaDecorator(new OnionPizza());
        pepperoniOnionPizza.makePizze();

        PizzaInterface jalapenoTomatoPizza = new JalapenoPizzaDecorator(new TomatoPizza());
        jalapenoTomatoPizza.makePizze();

        PizzaInterface pepperoniTomatoPizza = new PepperoniPizzaDecorator(new TomatoPizza());
        pepperoniTomatoPizza.makePizze();
        
    }
}
