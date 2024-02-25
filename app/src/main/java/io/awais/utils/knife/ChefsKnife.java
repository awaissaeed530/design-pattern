package io.awais.utils.knife;

public class ChefsKnife extends Knife {
  @Override
  public void sharpen() {
    System.out.println("Sharpen Done");
  }

  @Override
  public void polish() {
    System.out.println("Polish Done");
  }

  @Override
  public void box() {
    System.out.println("Boxing Done");
  }
}
