package test.methodandvalue;

/**
 * Created by sijiansheng on 2017/8/17.
 */
public class Test {

    public static void main(String[] args) {
       Person person = new Person("lisi",2);
        changeBoolen(person);
        System.out.println(person.toString());
    }

    public static void changeBoolen(Person person) {
       person.setAge(10);
       person.setName("zhangsan");
        person = new Person("wangermazi",8);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
