package io.awais;

import java.math.BigDecimal;

import org.junit.Test;

import io.awais.patterns.structural.facade.BankService;

public class FacadePatternTest {
  @Test
  public void test() {
    BankService bankService = new BankService();
    int savings = bankService.createNewAccount("savings", new BigDecimal(100));
    int current = bankService.createNewAccount("current", new BigDecimal(200));

    bankService.transferMoney(current, savings, new BigDecimal(50));
  }
}
