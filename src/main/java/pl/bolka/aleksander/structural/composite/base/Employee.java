package pl.bolka.aleksander.structural.composite.base;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Employee {

  private String name;

  private List<Employee> employees = new ArrayList<>();

  public Employee(String name) {
    this.name = name;
  }

  public void nameSelf(){
    System.out.println("Nazywam się " + name);
  }

  public void nameWorkers(){
    employees.forEach(Employee::nameSelf);
  }

}
