package pl.bolka.aleksander.structural.composite.hierachical;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {

  private String number;

  private Account parent;

  private List<Account> children = new ArrayList<>();

  public Account(String number) {
    this.number = number;
  }

  public void addChild(Account account){
    account.setParent(this);
    children.add(account);
  }

  public void printNumber(){
    System.out.println(getParentNumber(this));
  }

  private String getParentNumber(Account account) {
    Account parent = account.getParent();
    if (parent == null){
      return account.getNumber();
    } else {
      return getParentNumber(parent) + "." + account.getNumber();
    }
  }

  @Override
  public String toString() {
    return "Account{" +
           "number='" + number + '\'' +
           ", children=" + children +
           '}';
  }
}
