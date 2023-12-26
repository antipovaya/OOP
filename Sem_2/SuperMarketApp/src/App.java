import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionalClient;
import Classes.SpecialClient;
import Classes.TaxInspector;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello, World!");

        Market magnit = new Market();
        int limitOnThePromotion = 50; // лимит по акции
        
        iActorBehaviour client1 = new OrdinaryClient("Анна"); // для данного класса клиентов реализовала возврат
        iActorBehaviour client2 = new OrdinaryClient("Борис"); // для данного класса клиентов реализовала возврат
        iActorBehaviour client3 = new SpecialClient("Директор", 1);
        iActorBehaviour client4 = new TaxInspector();

        iActorBehaviour client5 = new PromotionalClient("Руслан", 0, "1+1 = 3"); // акционный клиент

        Actor client6 = new OrdinaryClient("Семен"); // для данного класса клиентов реализовала возврат

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        if ( PromotionalClient.getNumberOfParticipants() > limitOnThePromotion) {
            System.out.println("Акция закончилась, клиенту" + " " + client5.geActor().getName() + " " + "отказано в обслужиавании" ); // добавление акционного клиента
        } else magnit.acceptToMarket(client5);

        magnit.acceptToMarket(client6);
       
        

        
        magnit.update();
    }
}
