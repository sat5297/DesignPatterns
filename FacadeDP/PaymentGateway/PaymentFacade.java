package PaymentGateway;

public class PaymentFacade {
    private PaymentInterface debitCard;
    private PaymentInterface creditCard;
    private PaymentInterface wallet;
    private PaymentInterface UPI;

    public PaymentFacade(){
        creditCard = new CreditCard();
        debitCard = new DebitCard();
        UPI = new UPI();
        wallet = new Wallet();
    }

    public void payWithDebitCard(){
        debitCard.makePayment();
    }

    public void payWithCreditCard(){
        creditCard.makePayment();
    }

    public void payWithWallet(){
        wallet.makePayment();
    }

    public void payWithUPI(){
        UPI.makePayment();
    }
}
