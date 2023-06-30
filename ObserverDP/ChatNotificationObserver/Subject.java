package ObserverDP.ChatNotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private String message;
    protected List < ChatObserver > chatObservers = new ArrayList<ChatObserver>();

    public String getState(){
        return message;
    }

    public void setState(String message){
        this.message = message;
        notifyAllObservers(message);
    }

    public void attachObserver(ChatObserver chatObserver){
        chatObservers.add(chatObserver);
    }

    public void notifyAllObservers(String message){
        for(ChatObserver chatObserver : chatObservers){
            chatObserver.notificationUpdate(message);
        }
    }

}
