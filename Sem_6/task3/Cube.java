package Sem_6.task3;

public class Cube implements iLength, iSquare, iVolume {
    private int edge;

    public Cube(int edge) {
        this.edge = edge; // ребро
    }

    @Override
    public double area() { //площадь куба
        return 6 * edge * edge;
    }

    @Override
    public double volume() { // объем куба
        return edge * edge * edge;
    }

    @Override
    public double perimeter() {
        return 12 * edge; // полный периметр сторон
    }
    
}