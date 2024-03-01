package Controller.Interfaces;

import java.util.HashMap;
import java.util.List;

import Model.Core.Product;
import Model.Core.Toy;

public interface iGetModel {
    public List<Toy> getToys();
    public void createLot(List<Toy> toys);
    public void setQuantityById(int id, int count);
    public void setProbabilityById(int id, int count);
    public void saveAllToyToFile(List<Toy> toys);

   
    
}