package monsters;

public class Godzilla extends Kaiju implements IMovable {

  public Godzilla(String name, int healthValue, int attackValue) {
    super(name, healthValue, attackValue);
  }

  @Override
  String roar() {
    return "Roar! I am a Godzilla.";
  }

  @Override
  public String move() {
    return "I can move";
  }
}
