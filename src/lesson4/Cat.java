package lesson4;

public class Cat {// Создали кота с именем и возрастом. и два метода
    int age;
    String name;

    public void sayMeow() {
        System.out.println("Мяу!");
    }

    public void jump() {
        System.out.println("Прыг-скок!");
    }

    static int count = 0;//count (количество). Она отвечает за подсчет созданных котов.

    //Каждый раз, когда в методе main мы создаем кота, мы увеличиваем эту переменную на 1.
    public static void main(String[] args) {
        Cat barsik = new Cat();
        barsik.age = 3;
        barsik.name = "Барсик";
        barsik.sayMeow();
        barsik.jump();
        count++;

        Cat vasia = new Cat();
        vasia.age = 5;
        vasia.name = "Вася";
        vasia.sayMeow();
        vasia.jump();
        Cat.count++; // Cat.count++;   тоже будет правильно.

        //System.out.println(barsic.age + " " + barsic.name);
        System.out.println("Мы создали кота по имени " + barsik.name + ", его возраст - " + barsik.age);
        System.out.println("Мы создали кота по имени " + vasia.name + ", его возраст - " + vasia.age);

        System.out.println("Общее количество котов = " + count);
    }
}
