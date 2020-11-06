package Task08;

public class Person {
    Pet pet;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    String name;
    int age;
    char sex;

    String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Person x = new Person();
        x.setName("Vahe");
        x.setAge(44);
        x.setSex('M');

        System.out.println(x.getName() + " is " + x.age + " years old");

        Person y = new Person();
        y.setName("Nana");
        y.setAge(35);
        y.setSex('F');

        System.out.println(y.getName() + " is " + y.age + " years old");
    }
}
