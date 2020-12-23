package HW_10_11_12.HW_D;

    /*  Необходимо создать утилитарный класс со следующими методами:
    поиск сотрудника в массиве по его имени */

import HW_9.Employee;

public class EmployeeUtils {

public static IEmployee searchByName(IEmployee[] employees, String name){

    for (int i = 0; i < employees.length; i++){
        if (employees[i].getName().equals(name)){
            return employees[i];
        }
    }
    return null;
}

    //поиск наименьшей зарплаты в массиве

    public static IEmployee getMinSalary(IEmployee[] employees){
        IEmployee result = null;
        int min = Integer.MAX_VALUE;

            for (int i = 0; i < employees.length; i++){

                if (min > employees[i].getSalary()){
                    result = employees[i];
                    min = result.getSalary();
                }
            }
            return result;
        }

    //поиск наименьшего количества подчиненных в массиве менеджеров

    public static IManager getMinCount(IManager[] managers){
        IManager result = null;
        for (int i=0; i<managers.length; i++){
            if(result == null || result.getNumberOfSubordinates() > managers[i].getNumberOfSubordinates()){
            result = managers[i];
            }
        }

        return result;
    }
}
