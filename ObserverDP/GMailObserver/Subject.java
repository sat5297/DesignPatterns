package ObserverDP.GMailObserver;

import java.util.List;
import java.util.ArrayList;

public class Subject{
    
    private String state;
    private List < GmailObserver > gmailObservers = new ArrayList< GmailObserver >();

    public String getState(){
        return state;
    }

    public void setState(String state){
        this.state = state;
        notifyAllGmailObservers();
    }

    public void attach(GmailObserver gmailObserver){
        gmailObservers.add(gmailObserver);
    }

    public void notifyAllGmailObservers(){
        for(GmailObserver gmailObserver : gmailObservers){
            gmailObserver.notificationUpdate();
        }
    }

}