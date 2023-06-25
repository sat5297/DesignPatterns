package Image;

public class RealImage implements ImageInterface{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display(){
        System.out.println("Display : " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading : "+ fileName);
    }
}
