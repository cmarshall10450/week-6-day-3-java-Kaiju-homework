package monsters;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 01/11/2017.
 */
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

}
