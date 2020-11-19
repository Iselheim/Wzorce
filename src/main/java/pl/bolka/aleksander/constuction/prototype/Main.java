package pl.bolka.aleksander.constuction.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    VirusSeed virusSeed = new VirusSeed();

    List<Virus> virusList =new ArrayList<>();

    virusList.add(virusSeed.getVirus(1));
    virusList.add(virusSeed.getVirus(2));
    virusList.add(virusSeed.getVirus(1));
    virusList.add(virusSeed.getVirus(2));
    virusList.add(virusSeed.getVirus(2));

    virusList.forEach(System.out::println);

  }

}
