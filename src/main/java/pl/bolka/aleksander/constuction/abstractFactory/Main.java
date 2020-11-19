package pl.bolka.aleksander.constuction.abstractFactory;

import pl.bolka.aleksander.constuction.abstractFactory.factory.FactoryProducer;
import pl.bolka.aleksander.constuction.abstractFactory.model.Machine;
import pl.bolka.aleksander.constuction.abstractFactory.model.MachineType;

public class Main {

  public static void main(String[] args) {
    FactoryProducer factoryProducer = new FactoryProducer();
    Machine machine1 = factoryProducer.getMachine(MachineType.BOMBER);
    Machine machine2 = factoryProducer.getMachine(MachineType.FIGHTER);
    Machine machine3 = factoryProducer.getMachine(MachineType.FAMILY_CAR);
    System.out.println(machine1);
    System.out.println(machine2);
    System.out.println(machine3);
  }

}
