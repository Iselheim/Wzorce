package pl.bolka.aleksander.constuction.abstractFactory.model;

public enum MachineType {

  FIGHTER(MachineBaseType.PLANE),
  BOMBER(MachineBaseType.PLANE),
  TRUCK(MachineBaseType.CAR),
  FAMILY_CAR(MachineBaseType.CAR);

  private final MachineBaseType machineBaseType;

  MachineType(MachineBaseType machineBaseType) {
    this.machineBaseType = machineBaseType;
  }

  public MachineBaseType getMachineBaseType() {
    return machineBaseType;
  }
}

