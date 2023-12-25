package Interfaces;

import Classes.Actor;

public interface iQueueBehaviour {
    public void takeInQueue(iActorBehaviour actor);
    
    public void realeaseFromQueue();
    
    public void takeOrder();
    public void giveOrder();
    
    // public void getActor();
    
    
}
