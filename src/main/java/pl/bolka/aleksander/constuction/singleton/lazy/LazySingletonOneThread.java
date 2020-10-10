package pl.bolka.aleksander.constuction.singleton.lazy;

public class LazySingletonOneThread {

  private static LazySingletonOneThread instance;

  public static LazySingletonOneThread getInstance() {
    if (instance == null) { // (1)
      instance = new LazySingletonOneThread(); // (2)
    }
    return instance;
  }

  private LazySingletonOneThread() {
  }

}
