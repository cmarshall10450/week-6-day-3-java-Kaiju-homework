package vehicles;

/**
 * Created by chris on 01/11/2017.
 */
public abstract class Vehicle {

  String type;
  int healthValue;
  int attackValue;

  public Vehicle(String type, int healthValue, int attackValue) {
    this.type = type;
    this.healthValue = healthValue;
  }

  public String getType() {
    return type;
  }

  public int getHealthValue() {
    return healthValue;
  }

  public void reduceHealth(int amount) {
    this.healthValue -= amount;
  }
}
