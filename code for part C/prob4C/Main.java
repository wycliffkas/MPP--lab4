package prob4C;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order(1, LocalDate.of(2024, 6, 15), 2000.0),
                new Order(2, LocalDate.of(2024, 6, 20), 3000.0),
                new Order(3, LocalDate.of(2024, 5, 25), 1500.0)
        );


        Hourly hourlyEmployee = new Hourly(101, 20.0, 40);
        Salaried salariedEmployee = new Salaried(102, 5000.0);
        Commissioned commissionedEmployee = new Commissioned(103, 3000.0, 0.1, orders);


        System.out.println("Hourly Employee:");
        hourlyEmployee.print();
        Paycheck hourlyPaycheck = hourlyEmployee.calcCompensation(6, 2024);
        hourlyPaycheck.print();

        System.out.println("\nSalaried Employee:");
        salariedEmployee.print();
        Paycheck salariedPaycheck = salariedEmployee.calcCompensation(6, 2024);
        salariedPaycheck.print();

        System.out.println("\nCommissioned Employee:");
        commissionedEmployee.print();
        Paycheck commissionedPaycheck = commissionedEmployee.calcCompensation(6, 2024);
        commissionedPaycheck.print();
    }
}

