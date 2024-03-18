/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coremegaferia;

import coremegaferia.Stand;
import coreperson.Gerente;
import corebook.Libro;
import java.util.ArrayList;

/**
 *
 * @author lcabarcase
 */
public class Editorial {
    private String nit;
    private String name;
    private String address;
    private Gerente gerente;
    private ArrayList<Libro> libros;
    private ArrayList<Stand> stands;

    public Editorial(String nit, String name, String address, Gerente gerente) {
        this.nit = nit;
        this.name = name;
        this.address = address;
        this.gerente = gerente;
        libros = null;
        stands = null;
    }

    public String getNit() {
        return nit;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<Stand> getStands() {
        return stands;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

}
