package main.DesignPattern.state;

public class HasMoneyState implements VendingState{

    private double curMoney=0;

    public HasMoneyState(VendingMachine context,double val){
        insertMoney(context,val);
    }
    public HasMoneyState(){}

    @Override
    public void insertMoney(VendingMachine context,double val) {
        this.curMoney+=val;
        System.out.println("Inserted -- "+val);
        System.out.println("Total -- "+this.curMoney+"\n");
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        System.out.println("Ejected -- "+this.curMoney);
        this.curMoney=0;
        System.out.println("Total -- "+this.curMoney+"\n");
        context.setState(new NoMoneyState());
    }

    @Override
    public void dispenseProduct(VendingMachine context) {
        this.curMoney-=10;
        System.out.println("Dispensing Product (-10)");
        ejectMoney(context); // Eject rest of the money
    }
}
