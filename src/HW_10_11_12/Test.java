package HW_10_11_12;

import HW_10_11_12.HW_11.Employee;
import HW_10_11_12.HW_D.Manager;
import HW_10_11_12.HW_11.MonthUtils;
import HW_10_11_12.HW_D.EmployeeUtils;
import HW_10_11_12.HW_D.IManager;

public class Test {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setSalary(1000);

        System.out.println(employee.getSalary(MonthUtils.Q1));

        Manager manager1 = new Manager();
        manager1.setName("Sergey");
        manager1.setBaseSalary(1000);
        manager1.setNumberOfSubordinates(100);

        Manager manager2 = new Manager();
        manager2.setName("Vahe");
        manager2.setBaseSalary(2000);
        manager2.setNumberOfSubordinates(200);

        IManager[] arr = {manager1, manager2};
        IManager result = EmployeeUtils.getMinCount(arr);
        System.out.println(result);

        Employee employee1 = new Employee();
        employee1.setSalary(100);
        System.out.println(employee1.getSalary(new MonthUtils.IMonth[]{MonthUtils.JAN}));

    }

}
