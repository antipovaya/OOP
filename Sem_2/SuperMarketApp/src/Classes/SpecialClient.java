package Classes;

import Interfaces.iActorBehaviour;

public class SpecialClient extends Actor {

    private int idVIP;

    public SpecialClient(String name, int idVIP) {
        super(name);
        this.idVIP = idVIP;
        
    }

//     @Override
//     public boolean isTakeOrder() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'isTakeOrder'");
//     }

//     @Override
//     public boolean isMakeOrder() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'isMakeOrder'");
//     }

//     @Override
//     public void setTakeOrder(boolean val) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'setTakeOrder'");
//     }

//     @Override
//     public void setMakeOrder(boolean val) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'setMakeOrder'");
//     }

//     @Override
//     public Actor geActor() {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'geActor'");
//     }

//     @Override
//     public void setName(String name) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'setName'");
//     }
// }
    
    

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    public Actor geActor() {
        return this;
    }

    public String getName() {
        return super.name;
    }

    @Override
    public void setName(String name) {
        
        super.name = name;
    }
    
    public String returnOrder(){
        return super.name + " клиент вернул заказ";
    }


}

