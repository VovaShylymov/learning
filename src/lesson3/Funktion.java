package lesson3;


public class Funktion {
    public static int min(int a, int b, int c) {

        if (a <= b && a <= c)
            return a;
         else if (b <= a && b <= c)
            return b;
         else
             return c;
/*  Используется if для указания блока кода, который должен быть выполнен, если указанное условие истинно
    Используется else для указания блока кода, который будет выполнен, если то же условие ложно
    Используйте, else if чтобы указать новое условие для проверки, если первое условие ложно
    Используйте switch для указания множества альтернативных блоков кода, которые должны быть выполнены
  */
    }
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
