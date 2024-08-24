package main.DesignPattern.strategy;

public class Cart {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy ps){
        this.paymentStrategy=ps;
    }

    public void checkout(double amount){
        if(paymentStrategy==null){
            System.out.println("Choose a payment method");
            return;
        }
        System.out.printf("Amount: %.2f\n",amount);
        paymentStrategy.pay(amount);
    }
}
