/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Invitado
 */
public class Libro {

    //ATRIBUTOS//
    
    public String isbn;
    public String titulo;
    public String autor;
    public int paginas;

    //CONSTRUCTOR VACIO//

    public Libro() {
    }

    //CONSTRUCTOR CON PARAMETROS//
    
    public Libro(String isbn, String titulo, String autor, int paginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    
}
