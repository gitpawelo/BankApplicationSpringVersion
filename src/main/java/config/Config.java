package config;


import interfaces.BankTransaction;
import model.AccountOwner;
import model.BasicAccount;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class Config {

    @Bean
    public BankTransaction bankTransaction() {
        AccountOwner accountOwner = new AccountOwner("Jan", "Kowlaski", 1234);
        return new BasicAccount(new BigDecimal(10000), accountOwner);
    }


}
