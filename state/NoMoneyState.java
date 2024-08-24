package main.DesignPattern.state;

public class NoMoneyState implements VendingState{
    private double curMoney = 0;

    @Override
    public void insertMoney(VendingMachine context,double val) {
        curMoney+=val;
        if(val>=10){
            context.setState(new HasMoneyState(context,val));
        }
        else{
            ejectMoney(context);
        }
    }

    @Override
    public void ejectMoney(VendingMachine context) {
        if(this.curMoney>0){
            System.out.println("Ejecting -- "+this.curMoney);
            this.curMoney=0;
            System.out.println("Total -- "+this.curMoney+"\n");
        }
        else{
            System.out.println("No money is in the vending machine");
        }
    }

    @Override
    public void dispenseProduct(VendingMachine context) {
        System.out.println("Please insert money!");
    }
}
