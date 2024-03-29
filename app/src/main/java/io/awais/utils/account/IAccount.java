package io.awais.utils.account;

import java.math.BigDecimal;

public interface IAccount {
  public void deposit(BigDecimal amount);

  public void withdraw(BigDecimal amount);

  public void transfer(BigDecimal amount);

  public int getAccountNumber();
}
