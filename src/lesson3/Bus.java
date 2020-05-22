package lesson3;

import java.sql.SQLOutput;

public class Bus { //Это зодание объекта. Класс Bus содержит два поля и один метод
    public String model; //поля
    public String color; //поля

    public void showColor(){ // Mетод. Тоесть весь набор оперций в этом методе будет выполнятся при обращении
        //к данному Методу
        System.out.println(color);//тело метода


    }

    public void showModel() {

        System.out.println(model);
    }
}

