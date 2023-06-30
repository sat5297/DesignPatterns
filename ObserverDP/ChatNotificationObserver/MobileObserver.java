package ObserverDP.ChatNotificationObserver;

public class MobileObserver extends ChatObserver{
    
    public MobileObserver(Subject subject){
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    @Override
    public void notificationUpdate(String message){
        System.err.println("New Message on mobile : " + message);
    }
}
