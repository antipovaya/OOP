package domen;

public class Product {
    private String name;
    private int price;
    private int place;

    /**
     * 
     * @param name - имя продукта
     * @param price - цена продукта
     * @param place - место, занимаемое продуктом
     */

    public Product(String name, int price, int place){
        this.name = name;
        this.price = price;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    @Override
    public String toString() {
        
        return String.format("Продукт = %s Цена = %d Место = %d", this.name, this.price, this.place);
    }

}
