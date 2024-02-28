package io.awais.patterns.creational.factory.method;

import io.awais.utils.knife.Knife;
import io.awais.utils.knife.KnifeType;

public abstract class KnifeStore {
  public Knife orderKnife(KnifeType type) {
    Knife knife = createKnife(type);

    knife.sharpen();
    knife.polish();
    knife.box();

    System.out.println("Knife Order Complete");

    return knife;
  }

  abstract Knife createKnife(KnifeType type);
}
