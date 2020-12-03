package HW_10_11.HW_11;

    /* HW 11
    Необходимо реализовать задание из HW 10 со следующими условиями:
    Статические поля с объектами месяцев должны быть финальными
    Создать статические методы возвращающие кварталы (массивы по 3 месяца соответственно),
    полугодия и год.
    Необходимо создать базовый абстрактный класс BaseEmployee как общего родителя.
    Классы Employee и Manager должны быть финальными */

public abstract class BaseEmployee {

    private String name;
    private int age;
    private char sex;
    private int salary;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

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

    public abstract int getSalary(MonthUtils.Month[] months);

}


