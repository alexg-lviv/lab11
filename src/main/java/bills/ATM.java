package bills;

public class ATM {
    private Bill firstBill;

    public ATM(){
        Bill bill5 = new MainBill(5);
        Bill bill10 = new MainBill(10);
        Bill bill20 = new MainBill(20);

        bill20.setNextBill(bill10);
        bill10.setNextBill(bill5);
        this.firstBill = bill20;
    }

    public int process(int amount){
        this.firstBill.process(amount);
        return 0;
    }
}
