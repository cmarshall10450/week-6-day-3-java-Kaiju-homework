package vehicles;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by chris on 01/11/2017.
 */
public class TankTest {

  Tank tank;

  @Before
  public void before(){
    tank = new Tank("Tank", 100);
  }

  @Test
  public void tankHasType(){
    assertEquals("tank", tank.getType());
  }

}
