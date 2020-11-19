package pl.bolka.aleksander.constuction.abstractFactory.factory;

import pl.bolka.aleksander.constuction.abstractFactory.model.*;

public class CarFactory implements MachineFactory {

  private int wheelNumber;

  public CarFactory(int wheelNumber) {
    this.wheelNumber = wheelNumber;
  }

  @Override
  public Machine create(MachineType type) {
    switch (type) {
      case TRUCK:
        return new Truck(wheelNumber);
      case FAMILY_CAR:
        return new FamilyCar(wheelNumber);
    }
    return null;
  }
}
