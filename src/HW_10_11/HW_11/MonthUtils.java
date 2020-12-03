package HW_10_11.HW_11;

    /*Задача №1 HW 10

    Создать класс Month с полями: имя месяца, количеством дней и количеством рабочих дней.
    Создать класс MonthUtils который бы хранил подготовленные месяцы или их
    массивы для использования (объекты класса Month). */


public class MonthUtils {


    public static class Month {
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

    public static final Month JAN = new Month("JAN", 31, 23);
    public static final Month FEB = new Month("FEB", 28, 20);
    public static final Month MAR = new Month("MAR", 31, 22);

    public static final Month[] Q1 = {JAN, FEB, MAR};

    static int getSalary(BaseEmployee employee, MonthUtils.Month[] months){
        int result = 0;
        for (int i = 0; i < months.length; i++){
            result += months[i].getWorkDays() * employee.getSalary();
        }
        return result;
    }

}
