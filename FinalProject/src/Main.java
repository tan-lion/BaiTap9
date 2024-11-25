import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Declare
        Company company = new Company();
        Employee manager = new Employee("EmM1", "Tan manager", "0123456789", 30);
        Employee employee_1 = new Employee("Em1", "Nguyen Van A", "0816762731", 21, manager);
        Employee employee_2 = new Employee("Em2", "Nguyen Van D", "0816762732", 22, manager);
        Employee employee_3 = new Employee("Em3", "Nguyen Van F", "0816762733", 23, null);
        Employee employee_4 = new Employee("Em4", "Nguyen Van G", "0816762734", 24, null);
        Employee employee_5 = new Employee("Em5", "Nguyen Van H", "0816762735", 25, null);
        Employee employee_6 = new Employee("Em6", "Nguyen Van Z", "0816762731", 26, null);
        DepartmentHead departmentHead_1 = new DepartmentHead("DH1", "Department head 1", "0812345678", 30);
        DepartmentHead departmentHead_2 = new DepartmentHead("DH2", "Department head 2", "0812345679", 29);
        CEO cEO = new CEO("CEO1", "Tan CEO", "0816762733", 25, 0.5);
        CEO cEO_2 = new CEO("CEO1", "Tan CEO", "0816762733", 25, 0.1);
        CEO cEO_3 = new CEO("CEO1", "Tan CEO", "0816762733", 25, 0.8);

        //add employees
        departmentHead_1.addEmployee(employee_1);
        departmentHead_1.addEmployee(employee_2);
        departmentHead_2.addEmployee(employee_3);
        departmentHead_2.addEmployee(employee_4);
        departmentHead_2.addEmployee(employee_5);
        departmentHead_2.addEmployee(employee_6);
        company.addEmployee(manager);
        company.addEmployee(employee_1);
        company.addEmployee(employee_2);
        company.addEmployee(employee_3);
        company.addEmployee(employee_4);
        company.addEmployee(employee_5);
        company.addEmployee(employee_6);
        company.addEmployee(departmentHead_1);
        company.addEmployee(departmentHead_2);
        company.addEmployee(cEO);
        company.addEmployee(cEO_2);
        company.addEmployee(cEO_3);
        int choice;

        //Input
        do {
            System.out.println("==============================");
            System.out.println("1. Enter company information.");
            System.out.println("2. Assigning personnel to department heads.");
            System.out.println("3. Add or remove employee (Employee, Department head or CEO).");
            System.out.println("4. Export full information about company employees.");
            System.out.println("5. Calculate and export total salary for the entire company.");
            System.out.println("6. Find the employee with highest salary.");
            System.out.println("7. Find department head with highest employee number.");
            System.out.println("8. Sort employees alphabetically.");
            System.out.println("9. Sort employees in descending order.");
            System.out.println("10. Find CEO with the most shares.");
            System.out.println("11. Calculate and export total salary of each CEO.");
            System.out.println("0. Exit");
            System.out.println("==============================");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter tax code: ");
                    String taxCode = sc.nextLine();
                    System.out.println("Enter company name: ");
                    String companyName = sc.nextLine();
                    System.out.println("Enter month revenue: ");
                    long monthRevenue = sc.nextInt();
                    company.setTax_code(taxCode);
                    company.setName(companyName);
                    company.setMonth_revenue(monthRevenue);
                    System.out.println("Tax code: " + company.getTax_code());
                    System.out.println("Company na5me: " + company.getName());
                    System.out.println("Month revenue: " + company.getMonth_revenue());
                    break;
                case 2:

                    System.out.println("Department head 1: ");
                    System.out.println(departmentHead_1.toString());
                    for (Employee emp : departmentHead_1.getEmployees()) {
                        System.out.println(emp);
                    }
                    System.out.println("Department head 2: ");
                    System.out.println(departmentHead_2.toString());
                    for (Employee emp : departmentHead_2.getEmployees()) {
                        System.out.println(emp);
                    }
                    break;
                case 3:
                    System.out.println("Do you want to add or remove?");
                    System.out.println("1. Add new employee.");
                    System.out.println("2. Remove employee.");
                    int option_2 = sc.nextInt();
                    sc.nextLine();
                    //Condition
                    if (option_2 == 1) {
                        System.out.println("Enter employee id: ");
                        String add_employee_id = sc.nextLine();
                        System.out.println("Enter employee name: ");
                        String add_employee_name = sc.nextLine();
                        System.out.println("Enter phone number: ");
                        String add_phone_number = sc.nextLine();
                        System.out.println("Enter days work number: ");
                        int add_days_work_number = sc.nextInt();
                        Employee employee = new Employee(add_employee_id, add_employee_name, add_phone_number, add_days_work_number, departmentHead_1);
                        company.addEmployee(employee);
                    }
                    if (option_2 == 2) {
                        System.out.println("Enter employee id: ");
                        String remove_employee_id = sc.nextLine();
                        company.removeEmployee(remove_employee_id);
                    }
                    break;
                case 4:
                    company.export_employees();
                    break;
                case 5:
                    long total = (long) (company.getMonth_revenue() * cEO.getShare());
                    total += company.calculate_total_salary();
                    System.out.println("Total salary of employees: " + total);
                    break;
                case 6:
                    company.export_highest_employee_salary();

                    break;
                case 7:
                    company.find_department_head_with_highest_employee();
                    break;
                case 8:
                    company.export_employees_alpha();
                    break;
                case 9:
                    company.sort_salary_employees_desc();
                    break;
                case 10:
                    company.find_CEO_with_highest_shares();
                    break;
                case 11:
                    company.calculate_export_total_salary();
                    break;
            }

        } while (choice != 0);

    }
}
