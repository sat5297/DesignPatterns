package AbstractFactoryDP.Vehicles;

public class BMWFactory extends AbstractVehicleFactory{
    
    @Override
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Bike")){
            return new BMWBike();
        }
        else if(vehicleType.equalsIgnoreCase("Car")){
            return new BMWCar();
        }
        return new NULLVehicle();
    }
}
