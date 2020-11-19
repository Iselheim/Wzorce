package pl.bolka.aleksander.constuction.abstractFactory.model;

public class Bomber extends Plane {

  public Bomber(String fuelType) {
    super(fuelType);
  }

  @Override
  public String getName() {
    return getClass().getSimpleName();
  }
}
