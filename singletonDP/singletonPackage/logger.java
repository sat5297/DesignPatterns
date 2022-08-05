package singletonPackage;

class logger {
    private static int ctr;
    private static logger loggerInstace = null;

    private logger(){
        ctr += 1;
        System.out.println("New Instance " + ctr);
    }

    void Log(String msg){
        System.out.println(msg);
    }

    synchronized static logger getLogger(){
        if(loggerInstace == null){
            loggerInstace = new logger();
        }
        return loggerInstace;
    }
}