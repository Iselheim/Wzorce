package pl.bolka.aleksander.constuction.singleton.eager;

public enum EagerSingletonEnum {
  INSTANCE;

  private int currentCount = 0;

  public int getCurrentCount() {
    return currentCount;
  }

  public void increment() {
    currentCount++;
  }
}
