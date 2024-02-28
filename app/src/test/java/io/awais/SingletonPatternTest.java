package io.awais;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import io.awais.patterns.creational.singleton.SharedPreferences;

public class SingletonPatternTest {
  @Test
  public void test() {
    SharedPreferences.getInstance().setColor("Red");
    assertEquals(SharedPreferences.getInstance().getColor(), "Red");
  }
}
