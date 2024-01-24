package Sem_6.task3;

public class Circle implements iLength, iSquare {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius; //  длина окружности
    }

    @Override
    public double area() {
        return 3.14 * (radius * radius); //площадь окружности
    }
}