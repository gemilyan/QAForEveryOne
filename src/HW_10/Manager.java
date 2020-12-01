package HW_10;
/* Задача №3
    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день
    и количество подчиненных. Все поля сделать приватными и для каждого поля
    добавить методы set и get. Класс должен иметь метод - getSalary(Month[] monthArray),
    метод возвращает зарплату за те месяцы которые были переданы в качестве аргументов.
    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного. */


public class Manager extends Employee {

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public int getSalary(Month[] monthArray) {
        int baseResult = super.getSalary(monthArray);

        return baseResult + (baseResult/100 * getCount());
    }
}
