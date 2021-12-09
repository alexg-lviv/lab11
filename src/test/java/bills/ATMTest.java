package bills;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class ATMTest {
    ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    ATM atm;
    @BeforeEach
    void setUp() {
        atm = new ATM();
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }
    @org.junit.jupiter.api.Test
    void testProcess() {
        ATM atm = new ATM();
        atm.process(100);
        Assertions.assertEquals("you should take 0 of 5 UAH\n" +
                "you should take 0 of 10 UAH\n" +
                "you should take 5 of 20 UAH", outputStreamCaptor.toString().trim());
    }
    @org.junit.jupiter.api.Test
    void processException() {
        ATM atm = new ATM();
        atm.process(50);
        Assertions.assertEquals("you should take 0 of 5 UAH\n" +
                "you should take 1 of 10 UAH\n" +
                "you should take 2 of 20 UAH", outputStreamCaptor.toString().trim());
    }
}