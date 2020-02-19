public class Mokateers {
    private int employeeId;
    private String name;
    private long salary;

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public Mokateers(int employeeId, String name, long salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;

    }
    public void println() {
        System.out.println("Name :" + getName());
        System.out.println("Employee ID :" + getEmployeeId());
        System.out.println("Salary :" + getSalary());
    }
}
