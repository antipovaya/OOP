package Controller;

import java.util.ArrayList;
import java.util.List;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Core.Toy;

/**
 * ControllerClass
 */
public class ControllerClass {

    private iGetModel model;
    private iGetView view;
    private List<Toy> toyBuffer = new ArrayList<>();

    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Toy> toys)
    {
        if(toys.size()>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {

        
        toyBuffer = model.getToys();

        if(testData(toyBuffer))
        {
            view.printAllToys(toyBuffer);
        }
        else
        {
            System.out.println("Список игрушек пуст!");
        }
    }

    public void run()
    {
        Command com = (Command)Command.NONE;
        boolean getNewIter = true;
        while(getNewIter)
        {
            String command = view.prompt("Введите команду: LIST - вывод всех игрушек со склада, CREATE - создать лотерею, INVENTORY - инвентаризация, EXIT - выход из программы");
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;

                case CREATE:
                    model.createLot(model.getToys());
                    break;

                case INVENTORY:
                    boolean iterInventory = true;
                    while(iterInventory){
                        String command2 = view.prompt("QUANTITY - изменить количество, PROBABILITY - изменить вероятность");
                        com = Command.valueOf(command2.toUpperCase());
                        switch(com)
                        {
                            case QUANTITY:
                                int id = Integer.parseInt(view.prompt("Введите id товара"));
                                int count = Integer.parseInt(view.prompt("Введите количество товара"));
                                model.setQuantityById(id, count);
                                iterInventory = false;
                                break;
                            case PROBABILITY:
                                int idProduct = Integer.parseInt(view.prompt("Введите id товара"));
                                int probabilityNew = Integer.parseInt(view.prompt("Введите вероятность выигрыша"));
                                model.setProbabilityById(idProduct, probabilityNew);
                                iterInventory = false;
                                break;
                        }
                    }

                case LIST:
                    boolean iterList = true;
                    while(iterList){
                        String command3 = view.prompt("Записать данные в файл? Y/N");
                        switch(command3)
                        {
                            case "Y":
                                model.saveAllToyToFile(model.getToys());
                                iterList = false;
                                break;
                            case "N":
                                view.printAllToys(model.getToys());
                                iterList = false;
                                break;
                        }
                    }
            }
        }
    }

}