import java.util.ArrayList;
import java.util.List;

import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClassTest;
import Model.Core.Lottery;
import Model.Core.Toy;
import View.ViewClass;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");
        Toy toy1 = new Toy("Мишка", "Плюш", 2300, 50, 10, "Белый", "средний");
        Toy toy2 = new Toy("Мишка", "Плюш", 2500, 50, 10, "Розовый", "Большой");
        Toy toy3 = new Toy("Кукла", "пластик", 1500, 50, 10, "Красное платье", "Средняя");
        Toy toy4 = new Toy("Кукла", "пластик", 1000, 50, 20, "Розовое платье", "Маленькая");
        Toy toy5 = new Toy("Зайчик", "Плюш", 1000, 50, 20, "Розовый", "Средний");
        Toy toy6 = new Toy("Зайчик", "Плюш", 500, 50, 30, "Серый", "Маленький");
        

        toy1.setProbability(10); // метод, задающий вероятность для игрушки
    

        List<Toy> toys = new ArrayList<>(); // создаем список всех игрушек со склада

        toys.add(toy1);
        toys.add(toy2);
        toys.add(toy3);
        toys.add(toy4);
        toys.add(toy5);
        toys.add(toy6);


        // Lottery lot = new Lottery(toys);
        // lot.raffle(toys);


        iGetModel modeltest = new ModelClassTest(toys, "ToysDB.csv");
        iGetView view = new ViewClass();
        ControllerClass controller = new ControllerClass(modeltest, view);

        // controller.update();
        controller.run();

    }
}