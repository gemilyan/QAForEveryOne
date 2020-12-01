package HW_10;

/*Задача №1

    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    Создать класс MonthUtils который бы хранил подготовленные месяцы или их
    массивы для использования (объекты класса Month). */


public class Month {
    String name;
    int days;
    int workDays;

    public Month(String name, int days, int workDays) {
        this.name = name;
        this.days = days;
        this.workDays = workDays;
    }

    public String getName() {
        return name;
    }

    public int getDays() {
        return days;
    }

    public int getWorkDays() {
        return workDays;
    }
}
