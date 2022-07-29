#include "AnimalFactory.hpp"

Animal* AnimalFactory :: generateAnimal(string animalType){
    Animal *animal;
    if(animalType == "Cat"){
        animal = new Cat();
    }
    else if(animalType == "Dog"){
        animal = new Dog();
    }
    else if(animalType == "Horse"){
        animal = new Horse();
    }
    return animal;
}