package singletonPackage;

public class singleton extends Thread {
    public static void main(String[] args) {
        singleton thread1 = new singleton();
        singleton thread2 = new singleton();
        thread1.user1();
        thread2.user2();
    }

    void user1(){
        logger logger1 = logger.getLogger();
        logger1.Log("Logger1 logs");
    }

    void user2(){
        logger logger2 = logger.getLogger();
        logger2.Log("Logger2 logs");
    }
}
