package monsters;

/**
 * Created by chris on 01/11/2017.
 */
public class Godzilla extends Kaiju {

  public Godzilla(String name, int healthValue, int attackValue) {
    super(name, healthValue, attackValue);
  }

  @Override
  String roar() {
    return "Roar! I am a Godzilla.";
  }
}
