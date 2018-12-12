package bank;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BankAccountTest {
    @Test
    public void addDeposit() {
        BankAccount bankAccount = new BankAccount(100.00);
        assertEquals(174.35, bankAccount.deposit(74.35), 0.0);
    }

    @Test
    public void minusDeposit() {
        BankAccount bankAccount = new BankAccount(100.00);
        assertEquals(50.00, bankAccount.withDraw(50.00), 0.0);
    }

}
