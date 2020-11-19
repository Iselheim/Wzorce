package pl.bolka.aleksander.behavioral.interpreter;

public class Main {

  public static void main(String[] args) {

      Expression orCondition =  new OrExpression(
          new SqlExpression("const < 10000"),
          new SqlExpression("cost > 100"));

      Expression exists = new SqlExpression("id != null");
      Expression query =  new AndExpression(exists, orCondition);

      System.out.println("Any row exists? " + query.interpret("id"));
  }

}
