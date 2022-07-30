#include <bits/stdc++.h>
using namespace std;

class Bike{
    public:
        virtual void createBike() = 0;
        virtual void startBike() = 0;
        virtual void stopBike() = 0;
};

class FordBike : public Bike{
    public:
        void createBike(){
            cout << "Created Ford Bike\n";
        }
        void startBike(){
            cout << "Started Ford Bike\n";
        }
        void stopBike(){
            cout << "Stopped Ford Bike\n";
        }
};

class VolvoBike : public Bike{
    public:
        void createBike(){
            cout << "Created Volvo Bike\n";
        }
        void startBike(){
            cout << "Started Volvo Bike\n";
        }
        void stopBike(){
            cout << "Stopped Volvo Bike\n";
        }
};

class Car{
    public:
        virtual void createCar() = 0;
        virtual void startCar() = 0;
        virtual void stopCar() = 0;
};

class FordCar : public Car{
    public:
        void createCar(){
            cout << "Created Ford Car\n";
        }
        void startCar(){
            cout << "Started Ford Car\n";
        }
        void stopCar(){
            cout << "Stopped Ford Car\n";
        }
};

class VolvoCar : public Car{
    public:
        void createCar(){
            cout << "Created Volvo Car\n";
        }
        void startCar(){
            cout << "Started Volvo Car\n";
        }
        void stopCar(){
            cout << "Stopped Volvo Car\n";
        }
};

class IFactory{
    public:
        virtual Bike* createBike() = 0;
        virtual Car* createCar() = 0;
};

class FordFactory : public IFactory{
    public:
        Bike* createBike(){
            return new FordBike();
        }

        Car* createCar(){
            return new FordCar();
        }
};

class VolvoFactory : public IFactory{
    public:
        Bike* createBike(){
            return new VolvoBike();
        }

        Car* createCar(){
            return new VolvoCar();
        }
};



class AbstractFactory{
    public:
    static IFactory* createFactory(string factoryType){
        if(factoryType == "Volvo"){
            return new VolvoFactory();
        }
        else if(factoryType == "Ford"){
            return new FordFactory();
        }
        return new FordFactory();
    }
};

int main(){
    string factoryType;
    cout << "Enter the vehicle factory type:";
    cin >> factoryType;
    IFactory* factory = AbstractFactory::createFactory(factoryType);
    Bike* bike = factory->createBike();
    bike->createBike();
    bike->startBike();
    bike->stopBike();
    cout << endl << endl;
    Car* car = factory->createCar();
    car->createCar();
    car->startCar();
    car->stopCar();
    return 0;
}


//The process of creation of factory is also abstracted and the factory is created based on the user input.
//Based on this user input, the created Factory in turn creates the Elements in the Factory either a car or a bike.
//And then we can run the functions which are applicable to the car or the bike as per their abstract classes resp.