package lesson3;

public class Pets {
    public static void main(String[] args) {
        Cat vasa =new Cat();
        Dog kola =new Dog();
        Woman liza = new Woman();
        vasa.owner = liza;
        kola.owner =liza;

    }

    public static class Cat {
    Woman owner;
    }

    public static class Dog {
    Woman owner;
    }
    public static class Woman{

}
}



