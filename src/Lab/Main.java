package Lab;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment());
        context.makePayment(1000);

        context.setStrategy(new UpiPayment());
        context.makePayment(500);
    }
}

