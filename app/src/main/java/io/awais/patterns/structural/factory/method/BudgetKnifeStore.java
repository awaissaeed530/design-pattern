package io.awais.patterns.structural.factory.method;

import io.awais.utils.knife.BudgetChefsKnife;
import io.awais.utils.knife.BudgetSteakKnife;
import io.awais.utils.knife.Knife;
import io.awais.utils.knife.KnifeType;

public class BudgetKnifeStore extends KnifeStore {
  @Override
  Knife createKnife(KnifeType type) {
    switch (type) {
      case CHEFS:
        return new BudgetChefsKnife();
      case STEAK:
        return new BudgetSteakKnife();
      default:
        return new BudgetChefsKnife();
    }
  }
}
