package StrategyDP.PaymentStrategy;

public class Context {
    private PaymentStrategy paymentStrategy;

    public Context(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public String executeStategy(String message){
        return paymentStrategy.makePayment();
    }
}
