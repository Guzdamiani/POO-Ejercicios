/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej12;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class PersonaServicios {

    public void crearPersona(Persona p) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        p.setNombre(leer.nextLine());

        int anio;
        int mes;
        int dia;

        do {
            System.out.println("Ingrese el año de nacimiento:");
            anio = leer.nextInt();
            if (anio < 0 || anio > 3000) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (anio < 0 || anio > 3000);

        do {
            System.out.println("Ingrese el mes de nacimiento:");
            mes = leer.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Ingrese el día (fecha) de nacimiento:");
            dia = leer.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (dia < 1 || dia > 31);

        LocalDate fechaNac = LocalDate.of(anio, mes, dia);

        p.setFechaNacimiento(fechaNac);
    }

    public int calcularEdad(Persona p) {

        LocalDate fechaActual = LocalDate.now();

        int edad = fechaActual.getYear() - p.getFechaNacimiento().getYear();

        if (fechaActual.getMonthValue() < p.getFechaNacimiento().getMonthValue() || (fechaActual.getMonthValue() == p.getFechaNacimiento().getMonthValue() && fechaActual.getDayOfMonth() < p.getFechaNacimiento().getDayOfMonth())) {
            edad--;
        }

        return edad;
    }

    public boolean menorQue(int edad, Persona p) {
        
        LocalDate fechaActual = LocalDate.now();
        
        int edadP = fechaActual.getYear() - p.getFechaNacimiento().getYear();
        boolean menor;
        
        menor = edadP < edad;
        
        return menor;
    }
    
    public void mostrarPersona(Persona p) {
        
        System.out.println("El nombre de la persona es: " + p.getNombre());
        System.out.println("La fecha de nacimiento es " + p.getFechaNacimiento());
    }
}


