package interfaces;

import model.BasicAccount;
import model.PremiumAccount;

import java.math.BigDecimal;

public interface BankTransaction {

    void payIntoAccount(BigDecimal howMuch);

    void withdrawFromAccount(BigDecimal howMuch);

    void transferIntoBasicBankAccount(BasicAccount basicAccount, BigDecimal howMuch);

    void transferIntoPremiumAccount(PremiumAccount premiumAccount, BigDecimal howMuch);

}
