package pl.bolka.aleksander.constuction.singleton.eager;

public class EagerSingletonClass {

  private static final EagerSingletonClass INSTANCE = new EagerSingletonClass();

  public static EagerSingletonClass getINSTANCE() {
    return INSTANCE;
  }

  private EagerSingletonClass(){}
}
