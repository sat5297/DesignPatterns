#include <bits/stdc++.h>
#include "AnimalFactory.hpp"
using namespace std;

int main(){
    string animalType ;
    cout << "Enter the animal type: ";
    cin >> animalType;
    Animal *animal = AnimalFactory::generateAnimal(animalType);
    animal->createAnimal();
    animal->getAnimalSound();
    return 0;
}