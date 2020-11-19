package pl.bolka.aleksander.structural.decorator;

public class FlyingArmyRobot {

  private final int speed = 100;

  private final ArmyRobot armyRobot;

  public FlyingArmyRobot(ArmyRobot armyRobot) {
    this.armyRobot = armyRobot;
  }

  public void fly(){
    System.out.println("wziuuuu!");
    armyRobot.fight();
  }

  @Override
  public String toString() {
    return "FlyingArmyRobot{" +
           "speed=" + speed +
           ", armyRobot=" + armyRobot +
           '}';
  }
}
