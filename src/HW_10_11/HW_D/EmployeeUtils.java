package HW_10_11.HW_D;

    /*  Необходимо создать утилитарный класс со следующими методами:
    поиск сотрудника в массиве по его имени */

import HW_9.Employee;

public class EmployeeUtils {

public static Employee searchByName(Employee[] employees, String name){

    for (int i = 0; i < employees.length; i++){
        if (employees[i].getName().equals(name)){
            return employees[i];
        }
    }
    return null;
}

//поиск наименьшей зарплаты в массиве

public static Employee getMinSalary(Employee[] employees){
    Employee result = null;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < employees.length; i++){

        if (min > employees[i].getSalary()){
            result = employees[i];
            min = result.getSalary();
        }
    }
    return result;
    }
}
