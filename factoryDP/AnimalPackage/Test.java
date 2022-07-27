package AnimalPackage;

import java.util.Scanner;

public class Test{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Animal: ");
        String animalType = sc.nextLine();

        Animal animal = null;
        AnimalFactory animalGeneFactory = new AnimalFactory();
        animal = animalGeneFactory.makeAnimal(animalType);
        try{
            String ans = animal.getAnimal();
            System.out.println(ans);
        }
        catch(Exception exception){
            System.out.println("No such Animal in the Animal Factory.");
        }
        sc.close();
    }
}
