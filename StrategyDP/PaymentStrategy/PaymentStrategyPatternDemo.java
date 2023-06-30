package StrategyDP.PaymentStrategy;

public class PaymentStrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new PaymentCreditCard());
        System.out.println("Credit Card : " + context.executeStategy("CC"));

        Context context1 = new Context(new PaymentDebitCard());
        System.out.println("Credit Card : " + context1.executeStategy("DC"));

        Context context2 = new Context(new PaymentUPI());
        System.out.println("Credit Card : " + context2.executeStategy("UPI"));

        
    }
}
