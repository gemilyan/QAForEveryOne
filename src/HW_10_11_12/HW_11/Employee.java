package HW_10_11_12.HW_11;

/* Задача №2
    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
    Все поля сделать приватными и для каждого поля добавить методы set и get.
    Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает
    зарплату за те месяцы которые были переданы в качестве аргументов. */

public final class Employee extends BaseEmployee{

    @Override
    public int getSalary(MonthUtils.IMonth[] months){
        return MonthUtils.getSalary(this, months);
    }
}
