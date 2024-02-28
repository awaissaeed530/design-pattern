package io.awais.patterns.creational.factory.object;

import io.awais.utils.knife.Knife;
import io.awais.utils.knife.KnifeType;

public class KnifeStore {
  private KnifeFactory factory;

  public KnifeStore(KnifeFactory factory) {
    this.factory = factory;
  }

  public Knife orderKnife(KnifeType type) throws Exception {
    Knife knife;

    try {
      knife = factory.createKnife(type);
    } catch (Exception e) {
      throw new Exception();
    }

    knife.sharpen();
    knife.polish();
    knife.box();

    System.out.println("Knife Order Complete");

    return knife;
  }
}
