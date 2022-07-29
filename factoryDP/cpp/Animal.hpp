#ifndef animal_hpp
#define animal_hpp

class Animal{
    public:
        virtual void createAnimal() = 0;
        virtual void getAnimalSound() = 0;
};

#endif