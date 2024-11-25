public class Employee {
    protected String id;
    protected String full_name;
    protected String phone_number;
    protected int days_work_number;
    protected Employee manager;

    public Employee(String id, String full_name, String phone_number, int days_work_number, Employee manager) {
        this.id = id;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.days_work_number = days_work_number;
        this.manager = manager;

    }

    public Employee() {

    }

    public Employee(String id, String full_name, String phone_number, int days_work_number) {
        this.id = id;
        this.full_name = full_name;
        this.phone_number = phone_number;
        this.days_work_number = days_work_number;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getDays_work_number() {
        return days_work_number;
    }

    public void setDays_work_number(int days_work_number) {
        this.days_work_number = days_work_number;
    }

    public Employee getManager() {
        return manager;
    }

    public void setManager(Employee manager) {
        this.manager = manager;
    }

    public long calculate_salary() {
        return (long) (this.days_work_number * 100L);
    }


    @Override
    public String toString() {
        if (manager != null) {
            return "Id: " + id +
                    ", Full name: " + full_name +
                    ", Phone number: " + phone_number +
                    ", Days work number:" + days_work_number +
                    ", Manager: " + manager.getFull_name() +
                    ", Salary: " + calculate_salary();
        } else {
            return "Id: " + id +
                    ", Full name: " + full_name +
                    ", Phone number: " + phone_number +
                    ", Days work number:" + days_work_number +
                    ", Manager: " + manager +
                    ", Salary: " + calculate_salary();
        }
    }
}

