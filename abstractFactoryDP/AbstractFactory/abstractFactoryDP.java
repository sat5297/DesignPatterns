package AbstractFactory;
import java.util.*;

abstract class Bike{
    public abstract void createBike();
}

class FordBike extends Bike{
    public void createBike(){
        System.out.println("Created Ford Bike\n");
    }
}

class VolvoBike extends Bike{
    public void createBike(){
        System.out.println("Created Volvo Bike\n");
    }
}


abstract class Car{
    public abstract void createCar();
}

class FordCar extends Car{
    public void createCar(){
        System.out.println("Created Ford Car\n");
    }
}

class VolvoCar extends Car{
    public void createCar(){
        System.out.println("Created Volvo Car\n");
    }
}

abstract class IFactory {
    public abstract Bike createBike();
    public abstract Car  createCar();
}

class FordFactory extends IFactory{
    public Bike createBike(){
        return new FordBike();
    }
    public Car createCar(){
        return new FordCar();
    }
}

class VolvoFactory extends IFactory{
    public Bike createBike(){
        return new VolvoBike();
    }
    public Car createCar(){
        return new VolvoCar();
    }
}

class abstractFactory{
    public static IFactory createFactory(String factoryType){
        if(factoryType.equals("Volvo")){
            return new VolvoFactory();
        }
        else if(factoryType.equals("Ford")){
            return new FordFactory();
        }
        return new FordFactory();
    }
}


class abstractFactoryDP{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter factory type:");
        String factoryType = sc.nextLine();
        IFactory factory = abstractFactory.createFactory(factoryType);
        System.out.println(factory);
        Bike fordBike = factory.createBike();
        fordBike.createBike();

        Car fordCar = factory.createCar();
        fordCar.createCar();
        sc.close();
    }
}