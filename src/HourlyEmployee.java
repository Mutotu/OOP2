public class HourlyEmployee extends Employee{
    private double hourlyPayRate;

    public HourlyEmployee(String name, String birthday, String endDate,  String hireDate, double hourlyPayRate) {
        super(name, birthday, 1111, hireDate);
        this.hourlyPayRate = hourlyPayRate;
    }

    @Override
    public double collectPay() {
        return 40 * hourlyPayRate;
    }

    public double getDoublePay(){
    return  2 * collectPay();
    }
}
