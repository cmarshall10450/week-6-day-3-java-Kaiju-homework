package monsters;

import org.junit.Before;
import org.junit.Test;
import vehicles.Tank;

import static org.junit.Assert.assertEquals;

public class ScunnerTest {

  Scunner monster;

  @Before
  public void before() {
    monster = new Scunner("Godzilla", 100, 50);
  }

  @Test
  public void monsterHasName() {
    assertEquals("Godzilla", monster.getName());
  }

  @Test
  public void monsterHasHealthValue() {
    assertEquals(100, monster.getHealthValue());
  }

  @Test
  public void monsterHasAttackValue() {
    assertEquals(50, monster.getAttackValue());
  }

  @Test
  public void monsterCanRoar() {
    assertEquals("Roar! I am a Scunner.", monster.roar());
  }

  @Test
  public void monsterCanAttackVehicle() {
    Tank tank = new Tank("tank", 100);

    monster.attack(tank);
    assertEquals(50, tank.getHealthValue());
  }
}
