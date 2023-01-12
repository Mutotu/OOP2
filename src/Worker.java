public class Worker {
    private String name;
    private String birthday;
    protected String endDate;

    public Worker() {
    }

    public Worker(String name, String birthday) {
        this.name = name;
        this.birthday = birthday;

    }

    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthday.substring(6));
        return (currentYear - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
