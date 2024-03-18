/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremegaferia;

import java.util.ArrayList;

/**
 *
 * @author lcabarcase
 */
public class Stand {
   private int id;
   private double price;
   private ArrayList<Editorial> editoriales;

    public Stand(int id, double price) {
        this.id = id;
        this.price = price;
        editoriales = null;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public ArrayList<Editorial> getEditoriales() {
        return editoriales;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }
   
}
