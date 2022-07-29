#ifndef animal_factory_hpp
#define animal_factory_hpp
#include <iostream>
#include "Cat.hpp"
#include "Dog.hpp"
#include "Horse.hpp"
using namespace std;

class AnimalFactory{
    public:
        static Animal* generateAnimal(string animalType);
};

#endif