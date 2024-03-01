package Model;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Date;

import Controller.Interfaces.iGetModel;
import Model.Core.Lottery;
import Model.Core.Product;
import Model.Core.Toy;

public class ModelClassTest implements iGetModel{
    private List<Toy> toys;
    private String fileName;

    public ModelClassTest(List<Toy> toys, String fileName){
        this.toys = toys;
        this.fileName = fileName;
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public void saveAllToyToFile(List<Toy> toys){   
        Date datenow = new Date();
        try(FileWriter fw = new FileWriter(fileName, true))
        {
            for(Toy toy : toys)
            {
                
                fw.write(datenow+"\n"+toy.getId()+" "+toy.getName()+" "+toy.getMaterial()+" "+toy.getPrice()+" "+toy.getQuantity()+" "+toy.getProbability()+" "+toy.getColor()+" "+toy.getSize()+"\n");
                fw.append('\n');
            }
            fw.flush();    
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Toy> getToys() {
        return toys;
    }

    @Override
    public void createLot(List<Toy> toys) {
        Lottery lot = new Lottery(toys);
        lot.raffle(toys);
        
    }
    @Override
    public void setQuantityById(int id, int count){
        for (Toy toy : toys) {
            if (toy.getId() == id){
                toy.setQuantity(count);
            }
        }
    }
    @Override
    public void setProbabilityById(int id, int count){
        for (Toy toy : toys) {
            if (toy.getId() == id){
                toy.setProbability(count);
            }
        }
    }

    
}
