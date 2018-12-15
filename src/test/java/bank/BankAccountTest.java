package bank;

import org.junit.Test;

import static org.junit.Assert.*;

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

    @Test
    public void depositNotNull() {
        BankAccount bankAccount = new BankAccount(0.00);
        assertNotNull(bankAccount);
    }
}
