package pl.bolka.aleksander.constuction.abstractFactory.model;

public class Fighter extends Plane {

  public Fighter(String fuelType) {
    super(fuelType);
  }

  @Override
  public String getName() {
    return getClass().getSimpleName();
  }
}
