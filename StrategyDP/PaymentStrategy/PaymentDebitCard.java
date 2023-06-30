package StrategyDP.PaymentStrategy;

public class PaymentDebitCard implements PaymentStrategy{
    
    @Override
    public String makePayment(){
        System.out.println("Pay with Debit Card.");
        return "Pay with Debit Card.";
    }
}
