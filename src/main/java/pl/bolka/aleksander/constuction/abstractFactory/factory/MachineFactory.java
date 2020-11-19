package pl.bolka.aleksander.constuction.abstractFactory.factory;

import pl.bolka.aleksander.constuction.abstractFactory.model.Machine;
import pl.bolka.aleksander.constuction.abstractFactory.model.MachineType;

public interface MachineFactory {

  Machine create(MachineType type);

}
