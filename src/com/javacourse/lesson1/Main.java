package com.javacourse.lesson1;

import lesson3.Bus;

public class Main {
    public static void main(String[] args) {
        Bus ourBus;
        Bus firstBus;
        Bus secondBus;
        ourBus = new Bus();//ourBus эта переменная и есть ссылка на наш объект в памяти
        firstBus = new Bus();
        secondBus = new Bus();

        ourBus.color = "green";
        firstBus.color = "red";
        secondBus.color = "grey";

        ourBus.model = "Man 209";

        ourBus.showColor(); //задаём цвет нашим автобусам обращаясь к методу showColor
        firstBus.showColor();
        secondBus.showColor();

        ourBus.showModel();
    }
}
