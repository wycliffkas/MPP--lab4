package prob4C;

import java.time.LocalDate;
import java.util.List;

public class Commissioned extends Employee {
    private double commission;
    private double baseSalary;
    private List<Order> orders;

    public Commissioned(int empId, double baseSalary, double commission, List<Order> orders) {
        super(empId);
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int year) {
        double totalOrderAmount = 0.0;
        for (Order order : orders) {
            LocalDate orderDate = order.getOrderDate();
            if (orderDate.getMonthValue() == month && orderDate.getYear() == year) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        return baseSalary + (commission * totalOrderAmount);
    }




}
