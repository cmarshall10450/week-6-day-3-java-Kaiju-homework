package monsters;

import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class ScunnerTest {

  Scunner scunner;

  @Before
  public void before() {
    scunner = new Scunner("Scunner", 100, 50);
  }

  @Test
  public void monsterHasName() {
    assertEquals("Scunner", scunner.getName());
  }

  @Test
  public void monsterHasHealthValue() {
    assertEquals(100, scunner.getHealthValue());
  }

  @Test
  public void monsterHasAttackValue() {
    assertEquals(50, scunner.getAttackValue());
  }

  @Test
  public void monsterCanRoar() {
    assertEquals("Roar! I am a Scunner.", scunner.roar());
  }

  @Test
  public void monsterCanAttackVehicle() {
    Tank tank = new Tank("tank", 100, 50);

    scunner.attack(tank);
    assertEquals(50, tank.getHealthValue());
  }

  @Test
  public void monsterCanFly() {
    assertEquals("I can fly", scunner.fly());
  }

  @Test
  public void monsterCanMove() {
    Godzilla godzilla = new Godzilla("Godzilla", 300, 3000);
    assertEquals("I can move", godzilla.move());
  }

  @Test
  public void monsterCanReduceHealth() {
    scunner.reduceHealth(50);

    assertEquals(50, scunner.getHealthValue());
  }
}
