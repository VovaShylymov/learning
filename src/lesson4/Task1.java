package lesson4;

public class Task1 {
    public static int min(int a, int b, int c) {
        int x = min(a, b);
        return (x <= c ? x : c);

    }

    public static int min(int a, int b) {
        return (a <= b ? a : b);
    }

    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
/*Используется if для указания блока кода, который должен быть выполнен, если указанное условие истинно
        Используется else для указания блока кода, который будет выполнен, если то же условие ложно
        Используйте, else if чтобы указать новое условие для проверки, если первое условие ложно
        Используйте switch для указания множества альтернативных блоков кода, которые должны быть выполнены*/