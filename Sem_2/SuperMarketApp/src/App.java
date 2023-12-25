import Classes.Actor;
import Classes.Market;
import Classes.OrdinaryClient;
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
        

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);

        magnit.update();
    }
}
