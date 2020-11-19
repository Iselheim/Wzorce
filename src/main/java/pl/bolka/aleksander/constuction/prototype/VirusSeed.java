package pl.bolka.aleksander.constuction.prototype;

import java.util.HashMap;
import java.util.Map;

public class VirusSeed {

  private Map<Integer, Virus> virusSeeds = new HashMap<>();

  public VirusSeed() {
    Covid lowVirus = new Covid(50);
    lowVirus.setLockdown(false);
    virusSeeds.put(1, lowVirus);
    Covid highVirus = new Covid(1000);
    highVirus.setLockdown(true);
    virusSeeds.put(2, highVirus);
  }

  public Virus getVirus(int type){
    return virusSeeds.get(type).clone();
  }

}
