package main.DesignPattern.strategy;

public class CreditCardPayment implements PaymentStrategy{
    private String name,cvv,cardNumber,dateOfExpiry;

    public CreditCardPayment(String name,String cvv,String cardNumber,String dateOfExpiry){
        this.name=name;
        this.cvv=cvv;
        this.cardNumber=cardNumber;
        this.dateOfExpiry=dateOfExpiry;
    }


    @Override
    public void pay(double amount) {
        System.out.printf("Paying using credit card \nName: %s \nCVV: %s \nCard Number: %s \nExpiry: %s \n %n", name,cvv,cardNumber,dateOfExpiry);
    }
}
