package pl.bolka.aleksander.structural.adapter;

public class Main {

  public static void main(String[] args) {
    OldCode oldCode = new OldCode();
    CodeAdapter codeAdapter = new CodeAdapter();
    NewCode newCode = new NewCode();
    newCode.printValues(codeAdapter.asSet(oldCode.getData()));
  }

}

