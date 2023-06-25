package PaymentGateway;

public class UPI implements PaymentInterface{
    
    @Override
    public void makePayment(){
        System.out.println("Payment through UPI.");
    }
}
