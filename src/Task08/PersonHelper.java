package Task08;

public class PersonHelper {

    static void printPerson(Person[] people){
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i].getName());
        }
    }
    static int getAveAge(Person[] people){
        int sum = 0;
        for (int i = 0; i < people.length; i++){
            sum += people[i].getAge();
        }
        return sum / people.length;
    }
}
