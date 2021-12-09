package bills;

public interface Bill {
    void setNextBill(Bill bill);
    void process(int amount);
}
