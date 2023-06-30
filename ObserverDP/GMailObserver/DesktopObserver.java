package ObserverDP.GMailObserver;

public class DesktopObserver extends GmailObserver{
    
    public DesktopObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void notificationUpdate(){
        System.out.println("Notified Desktop.");
    }
}
