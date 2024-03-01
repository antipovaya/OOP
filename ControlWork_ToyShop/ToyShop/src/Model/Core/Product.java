package Model.Core;

public abstract class Product { // абстрактный класс, наследниками которго будут являться различные товары в детском магазине (например, игрушки, книги, одежда)
    private String name;
    private String material;
    private int price;
    private int quantity;
    private int probability;

    /**
     * 
     * @param name - наименование товара
     * @param material - материал, из которого товар изготовлен
     * @param price - цена
     * @param quantity - количество на складе
     * @param probability - вероятность выпадения в лотерее ( % от 100)
     */

    public Product(String name, String material, int price, int quantity, int probability) {
        this.name = name;
        this.material = material;
        this.price = price;
    
        this.quantity = quantity;
        this.probability = probability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
       
        return "\nНаименование = " + this.name+"\n"+
        "Материал = " + this.material+"\n"+
        "Цена = " + this.price+"\n"+
        "Остаток = " + this.quantity+"\n"+ 
        "Вероятность выигрыша = " + this.probability+"%"+"\n";
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
   

    public int getProbability() { // изменение вероятности выигрыша
        return probability;
    }

    public void setProbability(int probability) {
        this.probability = probability;
    }

}


// id игрушки,
// текстовое название,
// количество
// частота выпадения игрушки (вес в % от 100)