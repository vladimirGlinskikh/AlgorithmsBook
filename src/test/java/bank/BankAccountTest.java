package bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount bankAccount = null;

    @Before
    public void setUp() {
        bankAccount = new BankAccount(100);
    }

    @Test
    public void addDeposit() {
        assertEquals(174.35,
                bankAccount.deposit(74.35), 0.0);
    }

    @Test
    public void minusDeposit() {
        assertEquals(50.00,
                bankAccount.withDraw(50.00), 0.0);
    }

    @Test
    public void depositNotNull() {
        assertNotNull(bankAccount);
    }
}
