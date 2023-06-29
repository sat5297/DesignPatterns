package AbstractFactoryDP.Vehicles;

public class AbstractVehicleFactoryDemo {
    public static void main(String[] args) {
        AbstractVehicleFactory volvoFactory = VehicleFactoryProducer.getVehicleFactory("Volvo");
        Vehicle volvoBike = volvoFactory.getVehicle("Bike");
        volvoBike.drive();

        Vehicle volvoCar = volvoFactory.getVehicle("Car");
        volvoCar.drive();

        AbstractVehicleFactory bmwFactory = VehicleFactoryProducer.getVehicleFactory("BMW");
        Vehicle bmwBike = bmwFactory.getVehicle("Bike");
        bmwBike.drive();

        Vehicle bmwCar = bmwFactory.getVehicle("Car");
        bmwCar.drive();
    }
}
