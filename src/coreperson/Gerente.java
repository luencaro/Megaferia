/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coreperson;

import coremegaferia.Editorial;

/**
 *
 * @author lcabarcase
 */
public class Gerente extends Persona{
   private Editorial editorial;

    public Gerente(Editorial editorial) {
        this.editorial = editorial;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}
