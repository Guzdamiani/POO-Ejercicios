/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class LibroServicios {

    
    public Libro cargarLibro() {
        
        Libro l1 = new Libro();
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese el ISBN del libro: ");
        l1.isbn = leer.next();
        System.out.println("Ingrese el título del libro: ");
        l1.titulo = leer.next();
        System.out.println("Ingrese el autor del libro: ");
        l1.autor = leer.next();
        System.out.println("Ingrese el número de páginas del libro: ");
        l1.paginas = leer.nextInt();

        return l1;
    }

    public void mostrarLibro(Libro l1) {

        System.out.println("Información del libro:");
        System.out.println("ISBN: " + l1.isbn);
        System.out.println("Título: " + l1.titulo);
        System.out.println("Autor: " + l1.autor);
        System.out.println("Nº de páginas: " + l1.paginas);

    }
}
