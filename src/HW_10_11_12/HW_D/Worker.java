package HW_10_11_12.HW_D;

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

public class Worker implements IEmployee {

    private String name;
    private int baseSalary;
    protected static final double K = 100.0;

    public Worker(){
    }

    public Worker (String name, int baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return String.format("{name: %s; salary: %d}", getName(), getSalary());
    }

    public int getSalary() {
        return getBaseSalary();
    }
}
