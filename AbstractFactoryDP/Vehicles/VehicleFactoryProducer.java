package AbstractFactoryDP.Vehicles;

public class VehicleFactoryProducer {
    public static AbstractVehicleFactory getVehicleFactory(String vehicleType){
        if(vehicleType.equalsIgnoreCase("Volvo")){
            return new VolvoFactory();
        }
        else if(vehicleType.equalsIgnoreCase("BMW")){
            return new BMWFactory();
        }
        return null;
    }
}
