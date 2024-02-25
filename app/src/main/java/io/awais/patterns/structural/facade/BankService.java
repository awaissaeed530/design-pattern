package io.awais.patterns.structural.facade;

import java.math.BigDecimal;
import java.util.Hashtable;

import io.awais.utils.account.CurrentAccount;
import io.awais.utils.account.IAccount;
import io.awais.utils.account.SavingsAccount;

public class BankService {
  private Hashtable<Integer, IAccount> accounts;

  public BankService() {
    this.accounts = new Hashtable<>();
  }

  public int createNewAccount(String type, BigDecimal initialBalance) {
    IAccount newAccount = null;

    switch (type) {
      case "savings": {
        newAccount = new SavingsAccount(initialBalance);
        break;
      }
      case "current": {
        newAccount = new CurrentAccount(initialBalance);
        break;
      }
      default: {
        System.out.println("Invalid Account Type");
        break;
      }
    }

    if (newAccount != null) {
      this.accounts.put(newAccount.getAccountNumber(), newAccount);
      return newAccount.getAccountNumber();
    }

    return -1;
  }

  public void transferMoney(int to, int from, BigDecimal amount) {
    IAccount toAccount = this.accounts.get(to);
    IAccount fromAccount = this.accounts.get(from);
    fromAccount.transfer(amount);
  }
}
