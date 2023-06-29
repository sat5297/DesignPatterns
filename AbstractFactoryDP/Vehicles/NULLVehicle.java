package AbstractFactoryDP.Vehicles;

public class NULLVehicle implements Vehicle{
    
    @Override
    public void drive(){
        System.out.println("NULL Object cannot drive.");
    }
}
