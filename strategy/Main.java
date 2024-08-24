package main.DesignPattern.strategy;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();

        cart.setPaymentStrategy(new CreditCardPayment("Sammy","894","1248-4564-4554","08/04/2032"));
        cart.checkout(1200);

        cart.setPaymentStrategy(new BitcoinPayment("1da54s5fdsf48asd4f58f7aq"));
        cart.checkout(46522);
    }
}
