package ATMWithdrawal;

public class OneHundredWithdrawal extends AbstractWithdrawal{
    
    public OneHundredWithdrawal(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Two Thousand Notes Debited : " + message);
    }
}
