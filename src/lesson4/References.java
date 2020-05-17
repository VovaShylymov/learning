package lesson4;

public class References {


    String str = "Моя строка"; //str и str2 не являются объектами!!! Это ссылки на объект!!!
    String str2 = new String("Моя строка");

    public void foo(){ // метод foo
        new String("Моя строка"); // Объект это и есть вот это вся строка!!! И этот объект мы
    }            // присваеваем переменной str и str2.Тоесь str и str2 являются ссылкой!!!

}
  /*  public static void main(String[] args){

        print4("I like to move it, move it."); вызов функции
    }



    public static void print4 (String s){ функция

        System.out.println(s);

    }*/