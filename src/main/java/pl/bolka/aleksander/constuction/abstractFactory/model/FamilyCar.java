package pl.bolka.aleksander.constuction.abstractFactory.model;

public class FamilyCar extends Car {

  public FamilyCar(int wheelNumber) {
    super(wheelNumber);
  }

  @Override
  public String getName() {
    return getClass().getSimpleName();
  }
}
