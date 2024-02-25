package io.awais.patterns.structural.factory.object;

import io.awais.utils.knife.ChefsKnife;
import io.awais.utils.knife.Knife;
import io.awais.utils.knife.KnifeType;
import io.awais.utils.knife.SteakKnife;

public class KnifeFactory {
  public Knife createKnife(KnifeType type) throws Exception {
    switch (type) {
      case CHEFS:
        return new ChefsKnife();
      case STEAK:
        return new SteakKnife();
      default:
        throw new Exception("Invalid Knife Type provided");
    }
  }
}
