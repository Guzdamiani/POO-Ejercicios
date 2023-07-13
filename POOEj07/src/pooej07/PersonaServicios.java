/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej07;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class PersonaServicios {

    public Persona crearPersona() {

        Persona p = new Persona();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona que desea registrar:");
        p.setNombre(leer.next());

        System.out.println("Ingrese la edad de " + p.getNombre());
        p.setEdad(leer.nextInt());

        String sexo;

        do {

            System.out.println("Ingrese el sexo de " + p.getNombre() + ". Para hacerlo ingrese solamente H (hombre), M (mujer) u O (otro).");
            sexo = leer.next();
            sexo = sexo.toUpperCase();

            if ((sexo.equals("H") || sexo.equals("M")) || sexo.equals("O")) {
                
                p.setSexo(sexo);
                
            } else {
                System.out.println("La opción ingresada es inválida, intente nuevamente.");
            }

        } while ( !sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O"));

        System.out.println("Ingrese el peso (en kg) de " + p.getNombre());
        p.setPeso(leer.nextInt());

        System.out.println("Ingrese la altura (en mts) de " + p.getNombre());
        p.setAltura(leer.nextDouble());

        return p;
    }

    public int calcularIMC(Persona p) {

        double indice = (p.getPeso()) / (p.getAltura() * p.getAltura());
        int resultado;

        if (indice < 20) {
            System.out.println("La persona se encuentra por debajo de su peso ideal.");
            resultado = -1;
        } else if (indice <= 25) {
            System.out.println("La persona se encuentra en su peso ideal.");
            resultado = 0;
        } else {
            System.out.println("La persona tiene sobrepeso.");
            resultado = 1;
        }

        return resultado;
    }

    public boolean esMayorDeEdad(Persona p) {

        boolean esMayor;

        if (p.getEdad() >= 18) {
            esMayor = true;
            System.out.println("La persona es mayor de edad.");
        } else {
            esMayor = true;
            System.out.println("La persona es menor de edad.");
        }

        return esMayor;
    }

}
