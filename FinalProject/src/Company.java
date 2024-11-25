import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Company {
    private String tax_code;
    private String name;
    protected long month_revenue;
    private List<Employee> employees;

    public Company(String tax_code, String name, long month_revenue) {
        this.tax_code = tax_code;
        this.name = name;
        this.month_revenue = month_revenue;
    }

    public Company() {
        this.employees = new ArrayList<>();
    }

    public String getTax_code() {
        return tax_code;
    }

    public void setTax_code(String tax_code) {
        this.tax_code = tax_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getMonth_revenue() {
        return month_revenue;
    }

    public void setMonth_revenue(long month_revenue) {
        this.month_revenue = month_revenue;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    //case 3: add employee
    public void addEmployee(Employee employee) {
        if (!employees.contains(employee)) {
            this.employees.add(employee);
        } else {
            System.out.println("Employee already exists.");
        }
    }

    //case 3: remove employee
    public void removeEmployee(String employee_id) {
        List<DepartmentHead> departmentHeadList = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < employees.size(); i++) {
            if (employee_id.equals(employees.get(i).getId())) {
                if (employees.get(i).getId().contains("DH")) {
                    departmentHeadList.add((DepartmentHead) employees.get(i));
                    for (DepartmentHead departmentHead : departmentHeadList) {
                        if (employee_id.equals(departmentHead.getId())) {
                            departmentHead.getEmployees().removeAll(departmentHead.getEmployees());
                        }
                    }
                    employees.remove(employees.get(i));
                    flag = true;
                }

            }
        }
        if (!flag) {
            System.out.println("Employee does not exist.");
        } else {
            System.out.println("Employee successfully deleted.");
        }
    }

    //Case 4: Export employees
    public void export_employees() {
        System.out.println("CEO");
        for (Employee employee : employees) {
            if ((employee.getId()).contains("CEO")) {
                System.out.println(employee);
            }
        }
        System.out.println("Department head");
        for (Employee employee : employees) {
            if ((employee.getId()).contains("DH")) {
                System.out.println(employee);
            }
        }
        System.out.println("Employee.");
        for (Employee employee : employees) {
            if ((employee.getId()).contains("Em") || employee.getId().contains("EmM")) {
                System.out.println(employee);
            }
        }
    }

    //Case 5: calculate total salary of employees
    public long calculate_total_salary() {
        long total_salary = 0;
        for (Employee employee : employees) {
            total_salary += employee.calculate_salary();
        }
        return total_salary;
    }

    //Case 6: export department head with highest employees
    public void export_highest_employee_salary() {
        Employee highest_employee = employees.get(0);
        System.out.println("Highest employee salary");
        for (Employee employee : employees) {
            if (employee.getId().contains("Em")) {
                if (employee.calculate_salary() > highest_employee.calculate_salary()) {
                    highest_employee = employee;
                }
            }
        }
        System.out.println("Employee with highest salary: " + highest_employee.calculate_salary());
    }

    //Case 7: find department head with highest employee
    public void find_department_head_with_highest_employee() {
        List<DepartmentHead> departmentHeadsList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getId().contains("DH")) {
                departmentHeadsList.add((DepartmentHead) employee);
            }
        }
        DepartmentHead departmentHead = departmentHeadsList.get(0);
        for (DepartmentHead dH : departmentHeadsList) {
            System.out.println(dH.getEmployees().size());
            if (dH.count_employees() > departmentHead.count_employees()) {
                departmentHead = dH;
            }
        }
        System.out.println(departmentHead.toString());
    }

    //Case 8: Sort employees alpha
    public void export_employees_alpha() {
        int size = employees.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i; j < size - 1; j++) {
                if (employees.get(i).getFull_name().compareTo(employees.get(j + 1).getFull_name()) < 0) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }

    }

    //Case 9: Sort employees with salary with desc
    public void sort_salary_employees_desc() {
        int size = employees.size();
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size - 1; j++) {
                if (employees.get(i).calculate_salary() < employees.get(j + 1).calculate_salary()) {
                    Employee temp = employees.get(i);
                    employees.set(i, employees.get(j + 1));
                    employees.set(j + 1, temp);
                }
            }
        }
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    //Case 10: find CEO with highest shares
    public void find_CEO_with_highest_shares() {
        List<CEO> ceoList = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getId().contains("CEO")) {
                ceoList.add((CEO) employee);
            }
        }

        CEO ceo = ceoList.get(0);

        for (CEO ceo1 : ceoList) {
            if (ceo1.getShare() > ceo.getShare()) {
                ceo = ceo1;
            }
        }
        System.out.println(ceo.toString());
    }

    //Case 11: Calculate and export total salary
    public void calculate_export_total_salary() {
        long profit = this.month_revenue;
        List<CEO> ceoList = new ArrayList<>();
        for (Employee employee : employees) {
            profit -= employee.calculate_salary();
            if (employee.getId().contains("CEO")) {
                ceoList.add((CEO) employee);
            }
        }
        System.out.println(profit);
        for (CEO ceo : ceoList) {
            System.out.println(ceo.toString() + ", Salary: " + (ceo.calculate_salary() + profit * ceo.getShare()));
        }

    }

    @Override
    public String toString() {
        return "Company name: " + name + "Tax code: " + tax_code + ", Month revenue: " + month_revenue;
    }
}
