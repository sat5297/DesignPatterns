package PaymentGateway;

public class Wallet implements PaymentInterface{
    
    @Override
    public void makePayment(){
        System.out.println("Payment through Wallet.");
    }
}
