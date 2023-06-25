package PaymentGateway;

public class DebitCard implements PaymentInterface{
    
    @Override
    public void makePayment(){
        System.out.println("Payment through Debit Card.");
    }
}
