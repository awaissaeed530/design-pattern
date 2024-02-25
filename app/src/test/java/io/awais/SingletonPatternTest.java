package io.awais;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.awais.patterns.structural.singelton.SharedPreferences;

public class SingletonPatternTest {
  @Test
  public void storeReturnsProperInstance() {
    SharedPreferences.getInstance().setColor("Red");
    assertEquals(SharedPreferences.getInstance().getColor(), "Red");
  }
}
