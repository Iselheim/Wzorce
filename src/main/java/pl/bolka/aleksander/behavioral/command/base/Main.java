package pl.bolka.aleksander.behavioral.command.base;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<TextOperation> textOperationList = new ArrayList<>();

    textOperationList.add(new OpenTextOperation("/tmp/text.txt"));
    textOperationList.add(new SaveTextOperation("jakis dłuuugi tekst"));

    textOperationList.forEach(textOperation -> System.out.println(textOperation.execute()));
  }

}
