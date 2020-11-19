package pl.bolka.aleksander.structural.facade;

public class Connection {

  private String url;

  public Connection(String url) {
    this.url = url;
  }

  public void connect(){

  }

  public void setDialect(String dialect){

  }

  public String execute(String sqlQuery) {
    return sqlQuery.toLowerCase();
  }
}
