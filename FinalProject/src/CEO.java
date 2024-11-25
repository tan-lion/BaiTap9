public class CEO extends Employee {
    private double share;

    public CEO() {
        super();
    }

    public CEO(String id, String full_name, String phone_number, int days_work_number, double share) {
        super(id, full_name, phone_number, days_work_number);
        this.share = share;
    }

    public double getShare() {
        return share;
    }

    public void setShare(double share) {
        this.share = share;
    }

    @Override
    public long calculate_salary() {
        return (long) (this.days_work_number * 300L);
    }

    @Override
    public String toString() {
        return "Id: " + id +
                ", Full name: " + full_name +
                ", Phone number: " + phone_number +
                ", Days work number:" + days_work_number +
                ", Share: " + share;
    }
}
