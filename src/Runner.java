import monsters.Godzilla;
import vehicles.Tank;

/**
 * Created by chris on 01/11/2017.
 */
public class Runner {


  public static void main(String[] args) {
    Godzilla godzilla = new Godzilla("Godzilla", 500, 10);

    Tank tank = new Tank("tank", 100);

    for (int i = 0; i < 5; i++) {
      godzilla.attack(tank);
    }

    System.out.println(tank.getHealthValue());
  }
}
