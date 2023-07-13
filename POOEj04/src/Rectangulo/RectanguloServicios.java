/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Rectangulo;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class RectanguloServicios {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {

        Rectangulo r = new Rectangulo();

        System.out.println("Ingrese la base del rectángulo:");
        r.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectángulo:");
        r.setAltura(leer.nextInt());

        return r;
    }

    public int perimetroRectangulo(Rectangulo r) {

        int perimetro = (r.getBase() + r.getAltura()) * 2;

        return perimetro;
    }

    public int areaRectangulo(Rectangulo r) {

        int area = r.getBase() * r.getAltura();

        return area;
    }

    public void dibujarRectangulo(Rectangulo r) {

        for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if (i == 0 || j == 0 || i == r.getAltura() - 1 || j == r.getBase() - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
