package domen;

public class HotDrink extends Product {
    private int temperature;

    /**
     * Конструктор
     * @param name - наименование напитка
     * @param price - цена напитка
     * @param place - место
     * @param temperature - температура напитка
     */

    public HotDrink(String name, int price, int place, int temperature) {
        super(name, price, place);
        this.temperature = temperature;
    }

    // Методы
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format(" Температура напитка = %d ", temperature);
    }

    


}
