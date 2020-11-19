package pl.bolka.aleksander.structural.decorator;

public class Robot {

  private String name;

  public Robot(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Robot{" +
           "name='" + name + '\'' +
           '}';
  }
}
