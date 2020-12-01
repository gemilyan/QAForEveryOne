package HW_10;

/* Задача №2
    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    Все поля сделать приватными и для каждого поля добавить методы set и get.
    Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
    зарплату за те месяцы которые были переданы в качестве аргументов. */

public class Employee {

    private String name;
    private int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary(Month[] monthArray){
        int result = 0;
        for (int i=0; i< monthArray.length; i++){
            result += getSalary() * monthArray[i].getWorkDays();

        }
        return result;
    }
}
