package monsters;

import org.junit.Before;
import org.junit.Test;

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



}
