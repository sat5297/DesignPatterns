package ATMWithdrawal;

public abstract class AbstractWithdrawal {
    public static int TwoK = 1;
    public static int FiveH = 2;
    public static int TwoH = 3;
    public static int OneH = 4;

    protected int level;

    protected AbstractWithdrawal nexWithdrawal;

    public void setNextWithdrawal(AbstractWithdrawal nexWithdrawal){
        this.nexWithdrawal = nexWithdrawal;
    }

    public void debitAmout(int level, String message){
        if(this.level == level){
            write(message);
        }
        if(nexWithdrawal != null){
            nexWithdrawal.debitAmout(level, message);
        }
    }

    abstract void write(String message);
}
