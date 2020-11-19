package pl.bolka.aleksander.behavioral.command.base;

public class SaveTextOperation implements TextOperation {

  private String text;

  public SaveTextOperation(String text) {
    this.text = text;
  }

  @Override
  public String execute() {
    return "Saving file";
  }
}
