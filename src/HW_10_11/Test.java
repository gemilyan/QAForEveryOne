package HW_10_11;

import HW_10_11.HW_11.Employee;
import HW_10_11.HW_11.Manager;
import HW_10_11.HW_11.MonthUtils;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setSalary(1000);

        System.out.println(employee.getSalary(MonthUtils.Q1));

        Manager manager = new Manager();
        manager.setSalary(1000);
        manager.setCount(100);

        System.out.println(manager.getSalary(MonthUtils.Q1));

    }

}
