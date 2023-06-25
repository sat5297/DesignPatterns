package PaymentGateway;

public class PaymentFacadeDemo {
    public static void main(String[] args) {
        PaymentFacade paymentFacade = new PaymentFacade();

        paymentFacade.payWithCreditCard();
        paymentFacade.payWithDebitCard();
        paymentFacade.payWithUPI();
        paymentFacade.payWithWallet();
    }
}
