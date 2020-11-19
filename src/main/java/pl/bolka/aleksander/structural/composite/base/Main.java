package pl.bolka.aleksander.structural.composite.base;

public class Main {

  public static void main(String[] args) {
    Employee employee = new Employee("Janek");
    Employee employee2 = new Employee("Franek");
    Employee employee3 = new Employee("Grażyna");
    Employee employee4 = new Employee("Halina");

    Employee chief = new Employee("Szef");
    chief.getEmployees().add(employee);
    chief.getEmployees().add(employee2);
    chief.getEmployees().add(employee3);
    chief.getEmployees().add(employee4);

    chief.nameWorkers();

  }

}
