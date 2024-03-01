package Model.Core;

import java.util.List;

public class Toy extends Product {
    private int id;
    private static int generalId;
    private String color;
    private String size;
    /**
     * 
     * @param name - наименование игрушки
     * @param material - материал игрушки
     * @param price - цена игрушки
     * @param quantity - куличество на складе
     * @param probability - - вероятность выпадения в лотерее ( % от 100)
     * @param color - цвет игрушки
     * @param size - размер игрушки
     */

    public Toy(String name, String material, int price, int quantity, int probability, String color, String size) {
        super(name, material, price, quantity, probability);
        this.id = generalId;
        generalId++;
        this.color = color;
        this.size = size;
        
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        
        return "------------------------------"+
        "\nID = "+ this.id+"\n"+ 
        super.toString()+ 
        "Цвет = " + this.color+"\n"+
        "Размер = " + this.size+"\n"+
        "------------------------------";
    }

   

}
