package PaymentGateway;

public class CreditCard implements PaymentInterface{
    
    @Override
    public void makePayment(){
        System.out.println("Payment through Credit Card.");
    }
}
