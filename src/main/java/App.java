import config.Config;
import interfaces.BankTransaction;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        BankTransaction bankTran = (BankTransaction) context.getBean("premiumAccountTransaction");
        bankTran.payIntoAccount(new BigDecimal(1000));
        bankTran.withdrawFromAccount(new BigDecimal(32000));


    }
}
