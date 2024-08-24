package main.DesignPattern.state;

public class VendingMachine{
    private VendingState state;

    public VendingMachine(){
        this.state = new NoMoneyState();
    }

    public void setState(VendingState state){
        this.state=state;
    }

    public void insertMoney(double val) {
        state.insertMoney(this,val);
    }

    public void ejectMoney() {
        state.ejectMoney(this);
    }

    public void dispenseProduct() {
        state.dispenseProduct(this);
    }
}