package Controller.Interfaces;

import java.util.List;

import Model.Core.Product;
import Model.Core.Toy;

public interface iGetView {
    void printAllToys(List<Toy> toys);
    String prompt(String msg);
}
