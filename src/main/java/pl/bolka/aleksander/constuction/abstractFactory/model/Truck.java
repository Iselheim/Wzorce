package pl.bolka.aleksander.constuction.abstractFactory.model;

public class Truck extends Car {

  public Truck(int wheelNumber) {
    super(wheelNumber);
  }

  @Override
  public String getName() {
    return getClass().getSimpleName();
  }
}
