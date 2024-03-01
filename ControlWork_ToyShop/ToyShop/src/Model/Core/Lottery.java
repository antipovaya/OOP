package Model.Core;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lottery {

    private int numberLottery;
    private static int generalIdLottery;
    List<Toy> toys;
    
    public Lottery(List<Toy> toys){
        this.numberLottery = generalIdLottery;
        generalIdLottery++;
        this.toys = toys;
    }

    public int getNumberLottery() {
        return numberLottery;
    }

    public List<Toy> getProducts() {
        return toys;
    }

    public void setProducts(List<Toy> toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        String stringLot = new String();
        for (Toy toy : toys){
            stringLot += toy.toString() + "\n";
        }
        // return String.format("ID группы - %d", getNumberGroupe());
        return String.format("Номер лотереи - %d, игрушки: \n%s\n", getNumberLottery(), stringLot);
    }

    public void raffle(List<Toy> toys){
        List<Toy> toysLot = new ArrayList<>();
        for (Toy toy : toys){
            int n = toy.getProbability()/10;
            for (int i = 0; i < n; i++) {
                toysLot.add(toy);  
            }
        }
        int number = new Random().nextInt(15); // если поставить 11 то каждый билет будет с выигрышем
        if (number > toysLot.size()){
            System.out.println("К сожалению билет без выигрыша, предложите купить еще один");
        }
        else {
        System.out.println("Покупатель выйграл приз, выдайте его:\n" + toysLot.get(number));
        toysLot.get(number).setQuantity(toysLot.get(number).getQuantity() - 1); // уменьшаем количество игрушек на складе
        }

    }
}
