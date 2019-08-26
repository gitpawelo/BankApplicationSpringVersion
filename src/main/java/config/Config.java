package config;


import interfaces.BankTransaction;
import model.AccountOwner;
import model.BasicAccount;
import model.PremiumAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class Config {

    @Bean (name = "basicOwner")
    public AccountOwner basicAccountOwner(){
        return new AccountOwner("Jan", "Kowalski", 1234);
    }

    @Bean (name = "premiumOwner")
    public AccountOwner premiumAccountOwner(){
        return new AccountOwner("Zenon", "Nowak", 5678);
    }


    @Bean (name = "basicAccountTransaction")
    public BankTransaction bankTransactionOnBasicAccount() {
        return new BasicAccount(new BigDecimal(10000), basicAccountOwner());
    }

    @Bean (name = "premiumAccountTransaction")
    public BankTransaction bankTransactionOnPremiumAccount(){

        return new PremiumAccount(new BigDecimal(20000), premiumAccountOwner(), new BigDecimal(-10000));
    }


}
