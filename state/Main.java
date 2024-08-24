package main.DesignPattern.state;

// We can visualize state design pattern as state-transition diagram
public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();

        vm.insertMoney(45);
        vm.insertMoney(45);
        vm.dispenseProduct();
        vm.ejectMoney();

    }
}
