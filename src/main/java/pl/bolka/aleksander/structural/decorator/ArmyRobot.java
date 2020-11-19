package pl.bolka.aleksander.structural.decorator;

public class ArmyRobot {

  private final String weapon = "GUN";

  private final Robot robot;

  public ArmyRobot(Robot robot) {
    this.robot = robot;
  }

  public void fight(){
    System.out.println("Pif Paf");
  }

  @Override
  public String toString() {
    return "ArmyRobot{" +
           "weapon='" + weapon + '\'' +
           ", robot=" + robot +
           '}';
  }
}
