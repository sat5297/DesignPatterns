package observerPackage;
import java.util.*;

public class group {
    public ArrayList < subscriber > subscribersList = new ArrayList<subscriber>();

    public void subscribe(subscriber sub){
        subscribersList.add(sub);
    }

    public void unsubscribe(subscriber sub){
        subscribersList.remove(sub);
    }

    public void notify(String msg){
        int len = subscribersList.size();

        for(int i = 0; i < len; i++){
            subscribersList.get(i).notify(msg);
        }
    }
}
