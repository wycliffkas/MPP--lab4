package prob4E;

import java.util.List;

public class Admin {
	public static double computeUpdatedBalanceSum(List<Employee> list) {
		double totalSum = 0;

		for(Employee employee: list) {
			totalSum += employee.computeUpdatedBalanceSum();
		}

		return totalSum;
	}
}
