/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class CircunferenciaServicios {

    public Circunferencia crearCircunferencia() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el radio de la circunferencia en cm:");
        double radio = leer.nextDouble();

        Circunferencia c = new Circunferencia(radio);

        return c;
    }

    public double areaCircunferencia(double radio) {

        double area = Math.PI * Math.pow(radio, 2);

        return area;
    }

    public double perimetroCircunferencia(double radio) {

        double perimetro = 2 * Math.PI * radio;

        return perimetro;
    }

}
