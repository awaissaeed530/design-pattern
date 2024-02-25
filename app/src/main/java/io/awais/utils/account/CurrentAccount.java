package io.awais.utils.account;

import java.math.BigDecimal;
import java.util.Random;

public class CurrentAccount implements IAccount {
  private BigDecimal balance;
  private int accountNumber;

  public CurrentAccount(BigDecimal balance) {
    this.balance = balance;
    this.accountNumber = new Random().nextInt();
  }

  @Override
  public void deposit(BigDecimal amount) {
    System.out.println("Deposited" + amount + "into Current Account");
  }

  @Override
  public void withdraw(BigDecimal amount) {
    System.out.println("Withdrew" + amount + "from Current Account");
  }

  @Override
  public void transfer(BigDecimal amount) {
    System.out.println("Transfer" + amount + "from Current Account");
  }

  @Override
  public int getAccountNumber() {
    return this.accountNumber;
  }
}
