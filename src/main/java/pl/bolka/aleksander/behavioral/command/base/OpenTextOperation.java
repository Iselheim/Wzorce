package pl.bolka.aleksander.behavioral.command.base;

public class OpenTextOperation implements TextOperation {

  private String path;

  public OpenTextOperation(String path) {
    this.path = path;
  }

  @Override
  public String execute() {
    return "Opening file";
  }
}
