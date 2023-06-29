package AbstractFactoryDP.Vehicles;

public class VolvoFactory extends AbstractVehicleFactory{

    @Override
    public Vehicle getVehicle(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Bike")){
            return new VolvoBike();
        }
        else if(vehicleType.equalsIgnoreCase("Car")){
            return new VolvoCar();
        }
        return new NULLVehicle();
    }
}