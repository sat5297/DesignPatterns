package AnimalPackage;

public abstract class Animal{
    private String animalName;

    public String getAnimal(){
        return "Hi.. I am a " + animalName + "\n\n";
    }   

    public void setAnimalName(String Name){
        animalName = Name;
    }
}