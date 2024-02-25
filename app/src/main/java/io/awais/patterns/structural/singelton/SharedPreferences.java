package io.awais.patterns.structural.singelton;

public class SharedPreferences {
  private String color;
  private String theme;

  private static SharedPreferences instance = null;

  private SharedPreferences() {
  }

  public static SharedPreferences getInstance() {
    if (instance == null) {
      instance = new SharedPreferences();
    }

    return instance;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getTheme() {
    return theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

}
