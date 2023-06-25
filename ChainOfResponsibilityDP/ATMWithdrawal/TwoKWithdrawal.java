package ATMWithdrawal;

public class TwoKWithdrawal extends AbstractWithdrawal{
    
    public TwoKWithdrawal(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Two Thousand Notes Debited : " + message);
    }
}
