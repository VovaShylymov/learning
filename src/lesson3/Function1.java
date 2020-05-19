package lesson3;

public class Function1 { // минимум из четырёх чисел.
    public static int min(int a, int b, int c, int d) { // метод min
        int z = min(a, b);//объявил перем.Z и сразу присвоили значение функции min.
        int x = min(c, d);//объявил перем.X и сразу присвоили значение функции min.
        if (z < x) { // функция метода min
            return z;
        } else
            return x;
    }

    public static int min(int a, int b) { //метод min
        if (a < b) {  //функция метода
            return a;
        } else
            return b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }


}