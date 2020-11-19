package pl.bolka.aleksander.constuction.abstractFactory.factory;

import pl.bolka.aleksander.constuction.abstractFactory.model.Machine;
import pl.bolka.aleksander.constuction.abstractFactory.model.MachineType;

public class FactoryProducer {

  private final String fuelType;

  private final int wheelNumber;

  public FactoryProducer() {
    fuelType = getFuelType();
    wheelNumber = getWheelNumber();
  }

  public Machine getMachine(MachineType type){
    MachineFactory factory = null;
    switch (type.getMachineBaseType()) {
      case CAR:
        factory = new CarFactory(wheelNumber);
        break;
      case PLANE:
        factory =  new PlaneFactory(fuelType);
        break;
    }
    return factory.create(type);
  }

  private int getWheelNumber() {
    // reading from config file ...
    return 4;
  }

  private String getFuelType() {
    // reading from java param ...
    return "Oil";
  }
}
