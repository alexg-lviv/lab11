package bills;

public class MainBill implements Bill{
    private final int billType;
    private Bill next;

    public MainBill(int billType) {
        this.billType = billType;
    }

    @Override
    public void setNextBill(Bill next) {
        this.next = next;
    }

    @Override
    public void process(int amount) {
        if(this.next != null){
            next.process(amount%this.billType);
        } else if(amount%this.billType != 0){
            throw new IllegalArgumentException();
        }

        System.out.println("you should take " + amount/this.billType + " of " + this.billType + " UAH");
    }
}
