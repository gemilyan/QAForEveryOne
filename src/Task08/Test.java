package Task08;

public class Test {
    public static void main(String[] args) {
        Pet petCat = new Pet();
        petCat.setName("Barsik");

        Staff a = new Staff();
        a.setName("Sergey");
        a.setAge(30);
        a.setSex('M');
        a.setPet(petCat);
        a.setSalary(1000000);

        Pet petDog = new Pet();
        petDog.setName("Bob");

        Person b = new Person();
        b.setName("Anna");
        b.setAge(28);
        b.setSex('F');
        b.setPet(petDog);

        a.setPet(petDog);

        Person [] people = {a,b};

        PersonHelper.printPerson(people);

        System.out.println(PersonHelper.getAveAge(people));
        System.out.println(a.getPet().getName());
    }
}
