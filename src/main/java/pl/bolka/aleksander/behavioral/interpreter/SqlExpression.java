package pl.bolka.aleksander.behavioral.interpreter;

public class SqlExpression implements Expression {

  private String data;

  public SqlExpression(String data){
    this.data = data;
  }

  @Override
  public boolean interpret(String context) {
    return data.contains(context);
  }
}
