package Classes;

/**
 * Класс Акционный клиент
 */

public class PromotionalClient extends Actor {
    // поля
    
    private int id; // id клиента
    private String namePromotion; // название акции
    private static int numberOfParticipants; // количество участников в акции

    /**
     * 
     * @param name - имя клиента
     * @param id - id клиента
     * @param namePromotion - название акции к которой подключен клиент
     */

    public PromotionalClient(String name, int id, String namePromotion) {
        super(name);
        this.namePromotion = namePromotion;
        this.id = numberOfParticipants + 1;
        numberOfParticipants++;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    @Override
    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    @Override
    public Actor geActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    public int getId() {
        return id;
    }

    public String getNamePromotion() {
        return namePromotion;
    }

    public static int getNumberOfParticipants() {
        return numberOfParticipants;
    }


   
}