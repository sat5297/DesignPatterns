package ObserverDP.GMailObserver;

public class MobileObserver extends GmailObserver{
    
    public MobileObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void notificationUpdate(){
        System.out.println("Notified Mobile..");
    }
}
