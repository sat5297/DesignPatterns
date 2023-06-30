package ObserverDP.ChatNotificationObserver;

public abstract class ChatObserver {
    protected Subject subject;
    public abstract void notificationUpdate(String msg);
}
