package pl.bolka.aleksander.behavioral.command.task;

public class ComplexIf {

  public static void main(String[] args) {

    doOperation(Operation.CREATE);
    doOperation(Operation.DELETE);
    doOperation(Operation.UPDATE);
    doOperation(Operation.SELECT);

  }

  private static void doOperation(Operation create) {
    if (Operation.CREATE.equals(create)) {
      System.out.println("CREATE");
    } else if (Operation.DELETE.equals(create)) {
      System.out.println("DELETE");
    } else if (Operation.UPDATE.equals(create)) {
      System.out.println("UPDATE");
    } else if (Operation.SELECT.equals(create)) {
      System.out.println("SELECT");
    }
  }

}
