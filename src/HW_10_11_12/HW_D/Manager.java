package HW_10_11_12.HW_D;

public final class Manager extends Worker implements IManager{

    private int numberOfSubordinates;

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public final int getSalary() {
        if(numberOfSubordinates == 0){
            return super.getSalary();
        }else{
            return (int) (getBaseSalary() + getBaseSalary() * (numberOfSubordinates / K * 3));
        }
    }
}
