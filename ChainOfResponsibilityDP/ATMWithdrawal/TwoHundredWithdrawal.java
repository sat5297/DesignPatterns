package ATMWithdrawal;

public class TwoHundredWithdrawal extends AbstractWithdrawal{
    
    public TwoHundredWithdrawal(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Two Hundred Notes Debited : " + message);
    }
}
