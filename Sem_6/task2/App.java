package Sem_6.task2;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Car car = new Car(120, "Автомобиль", "БМВ");
        Bus bus = new Bus(120, "Автобус", "ПАЗ");
        System.out.println(car.calculateAllowedSpeed(car));
        System.out.println(bus.calculateAllowedSpeed(bus));
    }

}