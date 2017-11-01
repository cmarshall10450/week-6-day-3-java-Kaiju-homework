package monsters;

public abstract class Kaiju {

  String name;
  int healthValue;
  int attackValue;

  public Kaiju(String name, int healthValue, int attackValue) {
    this.name = name;
    this.healthValue = healthValue;
    this.attackValue = attackValue;
  }

  abstract String roar();

  public String getName() {
    return name;
  }

  public int getHealthValue() {
    return healthValue;
  }

  public int getAttackValue() {
    return attackValue;
  }
}
