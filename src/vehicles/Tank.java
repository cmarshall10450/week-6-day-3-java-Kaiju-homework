package vehicles;

import monsters.Kaiju;

public class Tank extends Vehicle implements IAttackable {

  public Tank(String type, int healthValue, int attackValue) {
    super(type, healthValue, attackValue);
  }

  public void attack(Kaiju kaiju) {
    kaiju.reduceHealth(this.attackValue);
  }
}
