package pl.bolka.aleksander.structural.adapter;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OldCode {

  public Map<String, Integer> getData(){
    HashMap<String, Integer> map = new HashMap<>();
    map.put("raz", 1);
    map.put("dwa", 2);
    map.put("trzy", 3);
    return map;
  }

}
