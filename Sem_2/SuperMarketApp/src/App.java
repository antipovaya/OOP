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
        
        iActorBehaviour client1 = new OrdinaryClient("Анна");
        iActorBehaviour client2 = new OrdinaryClient("Борис");

        iActorBehaviour client3 = new SpecialClient("Директор", 1);
        iActorBehaviour client4 = new TaxInspector();
        iActorBehaviour client5 = new PromotionalClient("Руслан", 0, "1+1 = 3");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        if ( PromotionalClient.getNumberOfParticipants() > 50) {
            System.out.println("Акция закончилась" + " " + client5.geActor().getName() + " " + "Не может быть добавлен в список акционных клиентов" );
        } else magnit.acceptToMarket(client5);

        magnit.update();
    }
}
