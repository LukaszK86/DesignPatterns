import Fasade.BankAccountFacade;
import org.testng.annotations.Test;

public class FacadeTestBankAccount {


    @Test
    public void testBankAccount() {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(200.00);
        accessingBank.depositCash(200);
    }
}
