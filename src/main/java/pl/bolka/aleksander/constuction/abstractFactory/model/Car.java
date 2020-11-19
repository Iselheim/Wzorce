package pl.bolka.aleksander.constuction.abstractFactory.model;

public abstract class Car implements Machine {

  private int wheelNumber;

  public Car(int wheelNumber) {
    this.wheelNumber = wheelNumber;
  }

  public int getWheelNumber() {
    return wheelNumber;
  }

  public void setWheelNumber(int wheelNumber) {
    this.wheelNumber = wheelNumber;
  }
}
