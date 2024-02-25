package io.awais.utils.account;

import java.math.BigDecimal;
import java.util.Random;

public class SavingsAccount implements IAccount {
  private BigDecimal balance;
  private int accountNumber;

  public SavingsAccount(BigDecimal balance) {
    this.balance = balance;
    this.accountNumber = new Random().nextInt();
  }

  @Override
  public void deposit(BigDecimal amount) {
    System.out.println("Deposited" + amount + "into Saving Account");
  }

  @Override
  public void withdraw(BigDecimal amount) {
    System.out.println("Withdrew" + amount + "from Saving Account");
  }

  @Override
  public void transfer(BigDecimal amount) {
    System.out.println("Transfer" + amount + "from Saving Account");
  }

  @Override
  public int getAccountNumber() {
    return this.accountNumber;
  }
}
