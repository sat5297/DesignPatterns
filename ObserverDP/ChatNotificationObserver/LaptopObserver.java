package ObserverDP.ChatNotificationObserver;

public class LaptopObserver extends ChatObserver{
    
    public LaptopObserver(Subject subject){
        this.subject = subject;
        this.subject.attachObserver(this);
    }

    public void notificationUpdate(String message){
        System.err.println("New Message on laptop : " + message);
    }
}
