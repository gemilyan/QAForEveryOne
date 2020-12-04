package HW_10_11_12.HW_11;

    /*Задача №1 HW 10
    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    Создать класс MonthUtils который бы хранил подготовленные месяцы или их
    массивы для использования (объекты класса Month).

    Задача №1 HW_12
    Необходимо реализовать задание из HW_10, но класс Month заменить на интерфейс
    IMonth, а его реализацию сделать приватным классом MonthImpl. */

public class MonthUtils {

    public interface IMonth {
        String getName();
        int getDays();
        int getWorkDays();
    }

    private static class MonthImpl implements IMonth{
        private String name;
        private int days;
        private int workDays;

        public MonthImpl(String name, int days, int workDays) {
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

    public static final IMonth JAN = new MonthImpl("JAN", 31, 23);
    public static final IMonth FEB = new MonthImpl("FEB", 28, 20);
    public static final IMonth MAR = new MonthImpl("MAR", 31, 22);

    public static final IMonth[] Q1 = {JAN, FEB, MAR};

    static int getSalary(BaseEmployee employee, IMonth[] months){
        int result = 0;
        for (int i = 0; i < months.length; i++){
            result += months[i].getWorkDays() * employee.getSalary();
        }
        return result;
    }

}
