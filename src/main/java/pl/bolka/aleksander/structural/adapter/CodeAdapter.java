package pl.bolka.aleksander.structural.adapter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CodeAdapter {

  public Set<Integer> asSet(Map<String, Integer> map){
    return new HashSet<>(map.values());
  }

}
