package io.awais;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import io.awais.patterns.creational.factory.method.BudgetKnifeStore;
import io.awais.patterns.creational.factory.method.KnifeStore;
import io.awais.utils.knife.BudgetChefsKnife;
import io.awais.utils.knife.Knife;
import io.awais.utils.knife.KnifeType;

public class FactoryMethodPatternTest {
  @Test
  public void test() {
    KnifeStore store = new BudgetKnifeStore();
    Knife knife = store.orderKnife(KnifeType.CHEFS);

    assertTrue(knife instanceof BudgetChefsKnife);
  }
}
