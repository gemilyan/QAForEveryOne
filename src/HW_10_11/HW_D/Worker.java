package HW_10_11.HW_D;

    /* Задача №2
    Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
    Необходимо создать класс Manager в который нужно добавить следующие методы:
    getNumberOfSubordinates - получить количество подчиненных
    setNumberOfSubordinates
    в классе, метод getSalary будет возвращать значение по формуле
    <базовая ставка> * (<количество подчиненных> / 100 * 3).
    Если количество подчиненных 0, то результат как у обычного рабочего.
    Необходимо создать класс Director с теми же методами, что и Manager,
    но метод getSalary должен возвращать результат по формуле
    <базовая ставка> * (<количество подчиненных> / 100 * 9).
    Если количество подчиненных 0, то результат как у обычного рабочего. */

public class Worker extends Employee {


    @Override
    public final int getBaseSalary() {
        return super.getBaseSalary();
    }

    @Override
    public int getSalary() {
        return getBaseSalary();
    }
}
