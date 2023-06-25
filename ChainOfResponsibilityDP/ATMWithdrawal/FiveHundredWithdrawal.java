package ATMWithdrawal;

public class FiveHundredWithdrawal extends AbstractWithdrawal{
    
    public FiveHundredWithdrawal(int level){
        this.level = level;
    }

    @Override
    protected void write(String message){
        System.out.println("Five Hundred Notes Debited : " + message);
    }
}
