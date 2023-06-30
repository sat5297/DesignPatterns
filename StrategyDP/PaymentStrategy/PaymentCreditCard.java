package StrategyDP.PaymentStrategy;

public class PaymentCreditCard implements PaymentStrategy{
    
    @Override
    public String makePayment(){
        System.out.println("Pay with Credit Card.");
        return "Pay with Credit Card.";
    }
}
