package main.DesignPattern.strategy;

public class BitcoinPayment implements PaymentStrategy{
    private final String bitcointAddress;
    public BitcoinPayment(String bitcointAddress){
        this.bitcointAddress=bitcointAddress;
    }

    @Override
    public void pay(double amount) {
        System.out.printf("Paying using bitcoin (Address: %s)",this.bitcointAddress);
    }
}
