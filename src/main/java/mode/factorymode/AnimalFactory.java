package mode.factorymode;

import scala.App;

/**
 * Created by sijiansheng on 2016/8/23.
 */
interface Animal {
}

class Dog implements Animal {
}

class Cat implements Animal {
}

public class AnimalFactory {

    public static Animal createAnimal(String kind){
        if("cat".equals(kind)) return new Cat();
        if("dog".equals(kind)) return new Dog();
        throw new IllegalArgumentException();
    }
}

class TestAnimalFactory {

    public static void main(String[] args) {
        AnimalFactory.createAnimal("dog");
    }

}