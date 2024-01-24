package Sem_6.task2;

public class Bus extends Vehicle {
    String model;


    public Bus(int maxSpeed, String type, String model) {
        super(maxSpeed, type);
        this.model = model;
    }

  
    public double calculateAllowedSpeed(Bus bus) {
   
    return super.maxSpeed * 0.6;
    
    } 
    
}