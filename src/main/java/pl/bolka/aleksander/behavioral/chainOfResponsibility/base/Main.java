package pl.bolka.aleksander.behavioral.chainOfResponsibility.base;

public class Main {

  public static void main(String[] args) {

    AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
    AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
    AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

    errorLogger.setNextLogger(fileLogger);
    fileLogger.setNextLogger(consoleLogger);


    errorLogger.logMessage(AbstractLogger.INFO,
        "INFO.");

    errorLogger.logMessage(AbstractLogger.DEBUG,
        "DEBUG");

    errorLogger.logMessage(AbstractLogger.ERROR,
        "ERROR");
  }

}
