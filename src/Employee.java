import java.util.Objects;

public class Employee {
    private static int counter = 1;

    private String fullName;
    private int department;
    private int salary;
    private int id;

    public Employee (String fullName, int department, double salary){
        this.fullName = fullName;
        this.department = department;
        this.salary = (int) salary;
        this.id = counter ++;
    }

    public String getFullName() {
        return fullName;
    }

    public int getId() {
        return id;

    }

    public int getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && Double.compare(salary, employee.salary) == 0 && id == employee.id && Objects.equals(fullName, employee.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    @Override
    public String toString() {
        return "Сотрудник:{" +
                "ФИО='" + fullName + '\'' +
                ", Отдел=" + department +
                ", Зарплата=" + salary +
                ", id=" + id +
                '}';
    }
}
