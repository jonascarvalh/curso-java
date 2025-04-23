package entities;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public int getId() { return id; }
    public String getName() { return name; }
    public double getSalary() { return salary; }

    public Employee(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double salary) {
        this.salary += this.salary * salary/100;
    }

    @Override
    public String toString() {
        return String.format(id + ", " + name + ", " + salary);
    }
}
