package ObserverDP.GMailObserver;

public class LaptopObserver extends GmailObserver{
    
    public LaptopObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void notificationUpdate(){
        System.out.println("Notified Laptop.");
    }
}
