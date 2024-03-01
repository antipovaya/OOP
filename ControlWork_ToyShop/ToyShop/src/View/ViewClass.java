package View;

import java.util.List;
import java.util.Scanner;

import Controller.Interfaces.iGetView;
import Model.Core.Product;
import Model.Core.Toy;

public class ViewClass implements iGetView{
    public void printAllToys(List<Toy> toys){
        System.out.println("----------------Список товаров на складе---------------------");
        for(Product t : toys)
        {
            System.out.println(t);
        }
        System.out.println("-----------------------------------------------------");
    }



    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
    
}
