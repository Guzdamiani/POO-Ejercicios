/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2extra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class PuntosServicios {

    Puntos ps = new Puntos();

    public Puntos crearPuntos() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de la posicion x para el punto 1:");
        ps.setX1(leer.nextInt());
        System.out.println("Ingrese el valor de la posicion y para el punto 1:");
        ps.setY1(leer.nextInt());
        System.out.println("Ingrese el valor de la posicion x para el punto 2:");
        ps.setX2(leer.nextInt());
        System.out.println("Ingrese el valor de la posicion y para el punto 2:");
        ps.setY2(leer.nextInt());

        return ps;

    }

    public double calcularDistancia() {

        double distancia = (double) Math.sqrt(Math.pow(ps.getX2() - ps.getX1(),2) + Math.pow(ps.getY2()-ps.getY1(),2));
        
        return distancia;
    }

}
