package HW_9;

    /*Необходимо создать класс Salary с единственным методом -
     getSum(Employee[] employeeArray), метод должен возвращать сумму зарплат
     всех сотрудников из массива переданного в качестве параметра вызова метода. */

import java.lang.reflect.Array;

public class Salary {

    public int getSum(Employee[] employeeArray){

        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++ ){
            sum += employeeArray[i].getSalary();
        }

        return sum;

    }

    public static void main(String[] args) {
        Salary s = new Salary();

        /*Employee x = new Employee();
        x.setName("Vahe");
        x.setAge(44);
        x.setSex('M');
        x.setSalary(100000);

        Employee y = new Employee();
        y.setName("Bob");
        y.setAge(24);
        y.setSex('M');
        y.setSalary(100000);*/

        Employee[] employeeArray = new Employee[]{};
        System.out.println(s.getSum(employeeArray));
    }

}
