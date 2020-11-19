package pl.bolka.aleksander.structural.facade;

import java.util.List;

public class DBFacade {

  public List<String> executeQuery(String query){
    Connection connection = new Connection("http://localhost:4321");

    SqlDriver sqlDriver = new SqlDriver();
    connection.setDialect(sqlDriver.getDialect());

    connection.connect();

    QueryParser queryParser = new QueryParser();
    String sqlQuery = queryParser.getQuery(query);

    String result = connection.execute(sqlQuery);

    ResultParser resultParser = new ResultParser();
    List<String> resultObjects = resultParser.parseOutput(result);

    return resultObjects;

  }

}
