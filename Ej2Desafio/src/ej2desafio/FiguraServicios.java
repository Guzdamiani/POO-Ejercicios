/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2desafio;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class FiguraServicios {

    Figura f1 = new Figura();

    public void perimetroAreaFigura(String nombre) {

        Scanner leer = new Scanner(System.in);

        double area;
        double perimetro;

        switch (nombre) {
            case "cuadrado":
                System.out.println("Ingrese el lado:");
                f1.setLado(leer.nextInt());
                perimetro = f1.getLado() * 4;
                area = f1.getLado() * f1.getLado();
                System.out.println("El area del " + nombre + " es " + area);
                System.out.println("El perimetro del " + nombre + " es " + perimetro);
                break;
            case "rectangulo":
                System.out.println("Ingrese la base:");
                f1.setBase(leer.nextInt());
                System.out.println("Ingrese la altura:");
                f1.setAltura(leer.nextInt());
                perimetro = (f1.getBase() * 2) + (f1.getAltura() * 2);
                area = f1.getBase() * f1.getAltura();
                System.out.println("El area del " + nombre + " es " + area);
                System.out.println("El perimetro del " + nombre + " es " + perimetro);
                break;
            case "triangulo":
                System.out.println("Ingrese el lado:");
                f1.setLado(leer.nextInt());
                System.out.println("Ingrese la altura:");
                f1.setAltura(leer.nextInt());
                perimetro = f1.getLado() * 3;
                area = (f1.getLado() * f1.getAltura()) / 2;
                System.out.println("El area del " + nombre + " es " + area);
                System.out.println("El perimetro del " + nombre + " es " + perimetro);
                break;
            case "circulo":
                System.out.println("Ingrese el radio:");
                f1.setRadio(leer.nextDouble());
                perimetro = 2 * Math.PI * f1.getRadio();
                area = Math.PI * Math.pow(f1.getRadio(), 2);
                System.out.println("El area del " + nombre + " es " + area);
                System.out.println("El perimetro del " + nombre + " es " + perimetro);
                break;
            case "hexagono":
                System.out.println("Ingrese el lado:");
                f1.setLado(leer.nextInt());
                System.out.println("Ingrese el apotema:");
                f1.setApotema(leer.nextInt());
                perimetro = f1.getLado() * 6;
                area = (f1.getLado() * 6) * f1.getApotema() / 2;
                System.out.println("El area del " + nombre + " es " + area);
                System.out.println("El perimetro del " + nombre + " es " + perimetro);
                break;
            case "pentagono":
                System.out.println("Ingrese el lado:");
                f1.setLado(leer.nextInt());
                System.out.println("Ingrese el apotema:");
                f1.setApotema(leer.nextInt());
                perimetro = f1.getLado() * 5;
                area = (f1.getLado() * 5) * f1.getApotema() / 2;
                System.out.println("El area del " + nombre + " es " + area);
                System.out.println("El perimetro del " + nombre + " es " + perimetro);
                break;
            case "rombo":
                System.out.println("Ingrese el lado:");
                f1.setLado(leer.nextInt());
                System.out.println("Ingrese la diagonal mayor:");
                f1.setDiagonalMayor(leer.nextInt());
                System.out.println("Ingrese la diagonal menor:");
                f1.setDiagonalMenor(leer.nextInt());
                perimetro = f1.getLado() * 4;
                area = f1.getDiagonalMayor() * f1.getDiagonalMenor() / 2;
                System.out.println("El area del " + nombre + " es " + area);
                System.out.println("El perimetro del " + nombre + " es " + perimetro);
                break;
            default:
                System.out.println("La figura ingresada es inválida");

        }

    }

}
