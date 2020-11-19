package pl.bolka.aleksander.constuction.singleton.lazy;

public class LazySingletonOneThread {

  private static LazySingletonOneThread instance;

  public static LazySingletonOneThread getInstance() {
    if (instance == null) {
      instance = new LazySingletonOneThread();
    }
    return instance;
  }

  private LazySingletonOneThread() {
  }

}
