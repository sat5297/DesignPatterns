package ATMWithdrawal;

public class ChainPatternDemo {
    
    private static AbstractWithdrawal getChainOfWithdrawal(){

        AbstractWithdrawal twoKWithdrawal = new TwoKWithdrawal(AbstractWithdrawal.TwoK);
        AbstractWithdrawal fiveHWithdrawal = new FiveHundredWithdrawal(AbstractWithdrawal.FiveH);
        AbstractWithdrawal twoHWithdrawal = new TwoHundredWithdrawal(AbstractWithdrawal.TwoH);
        AbstractWithdrawal oneHWithdrawal = new OneHundredWithdrawal(AbstractWithdrawal.OneH);

        twoKWithdrawal.setNextWithdrawal(fiveHWithdrawal);
        fiveHWithdrawal.setNextWithdrawal(twoHWithdrawal);
        twoHWithdrawal.setNextWithdrawal(oneHWithdrawal);

        return twoKWithdrawal;
    }

    public static void main(String[] args) {
        AbstractWithdrawal withdrawalChain = getChainOfWithdrawal();

        withdrawalChain.debitAmout(AbstractWithdrawal.TwoK, "Two Thousand ..!!");

        withdrawalChain.debitAmout(AbstractWithdrawal.FiveH, "Five Hundred...!!");

        withdrawalChain.debitAmout(AbstractWithdrawal.TwoH, "Two Hundred...!!");

        withdrawalChain.debitAmout(AbstractWithdrawal.OneH, "One Hundred..!!");
    }
}
