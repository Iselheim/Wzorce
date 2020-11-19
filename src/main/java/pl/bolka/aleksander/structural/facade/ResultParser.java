package pl.bolka.aleksander.structural.facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultParser {

  public List<String> parseOutput(String value){
    String[] split = value.split("");
    return Arrays.asList(split);
  }

}
