package Builder.Meal;

public abstract class Burger implements Item{
    
    @Override
    public Packaging packaging() {
        return new Wrapper();
    }

    public abstract float price();
}
