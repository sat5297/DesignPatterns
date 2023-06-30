package StrategyDP.PaymentStrategy;

public class PaymentUPI implements PaymentStrategy{
    
    @Override
    public String makePayment(){
        System.out.println("Pay with UPI.");
        return "Pay with UPI.";
    }
}
