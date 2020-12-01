package HW_9;

    /* Необходимо создать класс Person с полями: имя, возраст, пол.
     Класс должен иметь метод - getName, метод возвращает имя с префиксом
     “Mr.” если пол указан как мужской и префикс “Mrs. ” если женский. */

public class Person {

    String name;
    int age;
    char sex;

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
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

    String getName() {
        if (sex == 'M') {
            return "Mr. " + name;
        } else {
            return "Mrs. " + name;
        }
    }

    /*public static void main(String[] args) {
        Person x = new Person();
        x.setName("Vahe");
        x.setAge(44);
        x.setSex('M');
    }*/
}
