package pl.bolka.aleksander.constuction.singleton.lazy;

public class LazySingletonMultiThread {

  private static LazySingletonMultiThread instance;

  public static LazySingletonMultiThread getInstance() {
    if (instance == null) {
      synchronized (LazySingletonMultiThread.class) {
        if (instance == null) { // (2)
          instance = new LazySingletonMultiThread();
        }
      }
    }
    return instance;
  }

  private LazySingletonMultiThread() {
  }

}
