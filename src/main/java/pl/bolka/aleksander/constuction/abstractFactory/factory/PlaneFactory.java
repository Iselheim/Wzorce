package pl.bolka.aleksander.constuction.abstractFactory.factory;

import pl.bolka.aleksander.constuction.abstractFactory.model.*;

public class PlaneFactory implements MachineFactory {

  private String fuelType;

  public PlaneFactory(String fuelType) {
    this.fuelType = fuelType;
  }

  @Override
  public Machine create(MachineType type) {
    switch (type) {
      case BOMBER:
        return new Bomber(fuelType);
      case FIGHTER:
        return new Fighter(fuelType);
    }
    return null;
  }
}
