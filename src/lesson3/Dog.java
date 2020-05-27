package lesson3;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) { //конструктор класса
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("dog", 5);
        System.out.println(dog);
    }
}
