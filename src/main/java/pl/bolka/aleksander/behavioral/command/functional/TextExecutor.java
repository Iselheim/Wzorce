package pl.bolka.aleksander.behavioral.command.functional;

import java.util.ArrayList;
import java.util.List;

public class TextExecutor {

  private List<TextOperation> operations = new ArrayList<>();

  public TextExecutor() {
    operations.add(() -> "Opening big file!");
    operations.add(() -> "Saving text to file");
    operations.add(() -> "Saving text to database");
  }

  public void execute(){
    operations.forEach(textOperation -> System.out.println(textOperation.execute()));
  }
}
