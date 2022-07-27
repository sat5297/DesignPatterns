package AnimalPackage;

public class AnimalFactory{
    public Animal makeAnimal(String animalType){
        Animal animal = null;

        if(animalType.equals("Dog")){
            animal = new Dog();
        }
        else if(animalType.equals("Cat")){
            animal = new Cat();
        }
        else if(animalType.equals("Lion")){
            animal = new Lion();
        }
        else if(animalType.equals("Horse")){
            animal = new Horse();
        }
        else if(animalType.equals("Cow")){
            animal = new Cow();
        }
        return animal;
    }
}