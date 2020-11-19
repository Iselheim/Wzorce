package pl.bolka.aleksander.constuction.abstractFactory.model;

public abstract class Plane implements Machine {

  private final String fuelType;

  protected Plane(String fuelType) {
    this.fuelType = fuelType;
  }

  public String getFuelType() {
    return fuelType;
  }
}
