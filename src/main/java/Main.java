import bills.ATM;
import bills.Bill;
import bills.MainBill;
import builder.User;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        User user = User.builder().age(10).firstName("Elon").lastName("Musk").address("Kozelnytska2E").build();
        System.out.println(user);

    }
}
