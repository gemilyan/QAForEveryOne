package HW_10_11.HW_D;

    /*Задача №1
    Необходимо создать класс Employee со следующими методами:
    getBaseSalary - получить базовую ставку
    setBaseSalary
    getName - получить имя
    setName
    getSalary - получить зарплату*/

public abstract class Employee {

    private String name;
    private int baseSalary;
    protected static final double K = 100.0;

    public Employee(){
    }

    public Employee (String name, int baseSalary){
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

    public abstract int getSalary();

    @Override
    public String toString(){
        return String.format("{name: %s; salary: %d}", getName(), getSalary());
    }
}
