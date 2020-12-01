package HW_9;

    /* Необходимо создать класс Employee с полями: Person (из предыдущего задания), зарплата.
     Класс должен иметь метод isSameName(Employee employee) который возвращает true,если у сотрудника,
     у которого был вызван метод и сотрудника, который был передан как параметр, одинаковое имя. */

public class Employee extends Person{

    int salary;

    public Employee(String name, int age, char sex, int salary) {
        super(name, age, sex);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isSameName(Employee employee){
        return this.name == employee.name;
    }

    /*public static void main(String[] args) {
        Employee x = new Employee();
        x.setName("Vahe");
        x.setAge(44);
        x.setSex('M');
        x.setSalary(100000);

        Employee y = new Employee();
        y.setName("Bob");
        y.setAge(24);
        y.setSex('M');
        y.setSalary(100000);

        System.out.println(x.isSameName(y));
    }*/
}
