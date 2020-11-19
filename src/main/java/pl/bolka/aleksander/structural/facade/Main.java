package pl.bolka.aleksander.structural.facade;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    DBFacade dbFacade = new DBFacade();
    List<String> strings = dbFacade.executeQuery("Select * from tabela");
    strings.forEach(System.out::println);
  }

}
