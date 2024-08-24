package main.DesignPattern.state;

public interface VendingState {
    void insertMoney(VendingMachine context,double val);
    void ejectMoney(VendingMachine context);
    void dispenseProduct(VendingMachine context);
}
