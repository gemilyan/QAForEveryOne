package HW_10_11_12.HW_D;

    /* HW_11
    Необходимо реализовать задание из Tasks#D со следующими условиями:
    Employee.getSalary должен быть абстрактый
    Worker.getBaseSalary должен быть финальным
    Коэффициенты для расчета ЗП у Manager и Director должны быть константами
    (коэффициенты из формулы расчета ЗП)
    Классы Manager и Director должны быть финальными */

public final class Director extends Worker {
    int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }
    @Override
    public int getSalary() {

        if(numberOfSubordinates == 0){
            return super.getSalary();
        }else{
            return (int) (getBaseSalary() + getBaseSalary() * (numberOfSubordinates / K * 9));
        }
    }
}
