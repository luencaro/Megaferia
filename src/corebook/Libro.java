/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corebook;

import java.util.ArrayList;
import coremegaferia.Editorial;
import coreperson.Autor;

/**
 *
 * @author lcabarcase
 */
public abstract class Libro {
    protected String title;
    protected ArrayList<Autor> autores;
    protected String isbn;
    protected String genre;
    protected String format;
    protected double value;
    protected Editorial editorial;



    public String getTitle() {
        return title;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getGenre() {
        return genre;
    }

    public String getFormat() {
        return format;
    }

    public double getValue() {
        return value;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
}
