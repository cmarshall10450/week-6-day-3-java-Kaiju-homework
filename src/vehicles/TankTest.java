package vehicles;

import monsters.Godzilla;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 01/11/2017.
 */
public class TankTest {

  Tank tank;

  @Before
  public void before() {
    tank = new Tank("Tank", 100, 10);
  }

  @Test
  public void tankHasType() {
    assertEquals("tank", tank.getType());
  }

  @Test
  public void tankHasHealthValue() {
    assertEquals(100, tank.getHealthValue());
  }

  @Test
  public void tankCanReduceHealth() {
    tank.reduceHealth(50);

    assertEquals(50, tank.getHealthValue());
  }

  @Test
  public void tankCanAttackMonster() {
    Godzilla godzilla = new Godzilla("Godzilla", 100, 100);
    tank.attack(godzilla);

    assertEquals(90, godzilla.getHealthValue());
  }

}
