package pl.bolka.aleksander.constuction.prototype;

public abstract class Virus {

  public int power;

  public Virus(int power) {
    this.power = power;
  }

  public Virus(Virus virus) {
    if (virus != null) {
      this.power = virus.power;
    }
  }

  public abstract Virus clone();

}
