package pl.bolka.aleksander.structural.composite.hierachical;

public class Main {

  public static void main(String[] args) {
    Account account1 = new Account("1");
    Account account10 = new Account("10");
    Account account100 = new Account("100");
    Account account1000 = new Account("1000");
    Account account2000 = new Account("2000");
    Account account3000 = new Account("3000");

    Account account2 = new Account("2");
    Account account20 = new Account("20");
    Account account200 = new Account("200");

    Account account0 = new Account("0");

    account0.addChild(account1);
    account0.addChild(account2);

    account1.addChild(account10);
    account1.addChild(account20);

    account2.addChild(account10);
    account2.addChild(account20);

    account10.addChild(account100);
    account10.addChild(account200);

    account20.addChild(account100);
    account20.addChild(account200);

    account100.addChild(account1000);
    account100.addChild(account2000);
    account100.addChild(account3000);

    account200.addChild(account1000);
    account200.addChild(account2000);
    account200.addChild(account3000);

    account3000.printNumber();

    System.out.println(account0.toString());

  }

}
