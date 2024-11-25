import java.util.ArrayList;
import java.util.List;

public class DepartmentHead extends Employee {
    private List<Employee> employees = new ArrayList<>();

    public DepartmentHead() {
        super();
    }


    public DepartmentHead(String id, String full_name, String phone_number, int days_work_number, Employee manager, List<Employee> employees) {
        super(id, full_name, phone_number, days_work_number, manager);
        this.employees = employees;
    }

    public DepartmentHead(String id, String full_name, String phone_number, int days_work_number) {
        super(id, full_name, phone_number, days_work_number);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public long calculate_salary() {
        return (long) (this.days_work_number * 200L + 100L * employees.size());
    }

    // add employee
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    // find employee name
    public boolean find_employee_name(String name) {
        for (Employee employee : employees) {
            if (name.equals(employee.getFull_name())) {
                return true;
            }
        }
        return false;
    }

    //count size
    public int count_employees() {
        return this.employees.size();
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Full name: " + full_name +
                ", Phone number: " + phone_number +
                ", Days work number:" + days_work_number +
                ", Salary: " + calculate_salary();
    }
}
