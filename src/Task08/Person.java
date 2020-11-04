package Task08;

public class Person {
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
        Person a = new Person();
        a.setName("Vahe");
        a.setAge(44);
        a.setSex('M');

        System.out.println(a.getName() + " is " + a.age + " years old");

        Person b = new Person();
        b.setName("Nana");
        b.setAge(35);
        b.setSex('F');

        System.out.println(b.getName() + " is " + b.age + " years old");
    }
}
