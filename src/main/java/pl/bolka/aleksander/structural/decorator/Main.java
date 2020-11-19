package pl.bolka.aleksander.structural.decorator;

public class Main {

  public static void main(String[] args) {
    Robot mikser = new Robot("Mikser");

    System.out.println(mikser.toString());

    ArmyRobot terminator = new ArmyRobot(new Robot("Terminator"));
    System.out.println(terminator);
    terminator.fight();

    FlyingArmyRobot dron = new FlyingArmyRobot(new ArmyRobot(new Robot("Dron")));
    System.out.println(dron);
    dron.fly();

    FlyingArmyRobot flyingMikser = new FlyingArmyRobot(new ArmyRobot(mikser));
    System.out.println(flyingMikser);
    flyingMikser.fly();
  }

}
