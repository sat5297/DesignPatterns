package observerPackage;

public class subscriber extends observer {
    protected int userID;

    subscriber(int userID){
        this.userID = userID;
    }

    public void notify(String msg){
        System.out.println(userID + " " +msg);
    }
}
