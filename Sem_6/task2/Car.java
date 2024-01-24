package Sem_6.task2;

public class Car extends Vehicle {
    String model;


    public Car(int maxSpeed, String type, String model) {
        super(maxSpeed, type);
        this.model = model;
    }

  
    public double calculateAllowedSpeed(Car car) {
   
    return super.maxSpeed * 0.8;
    
    } 
    
}
