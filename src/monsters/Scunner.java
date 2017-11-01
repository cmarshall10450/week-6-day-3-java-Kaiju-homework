package monsters;

public class Scunner extends Kaiju implements IFlyable {

  public Scunner(String name, int healthValue, int attackValue) {
    super(name, healthValue, attackValue);
  }

  @Override
  String roar() {
    return "Roar! I am a Scunner.";
  }

  @Override
  public String fly() {
    return "I can fly";
  }
}
