package monsters;

import monsters.Kaiju;

public class Scunner extends Kaiju {

  public Scunner(String name, int healthValue, int attackValue) {
    super(name, healthValue, attackValue);
  }

  @Override
  String roar() {
    return "Roar! I am a Scunner.";
  }
}
