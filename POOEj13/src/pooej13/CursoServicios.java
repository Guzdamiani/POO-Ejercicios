/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej13;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class CursoServicios {

    public void cargarAlumnos(Curso c) {

        Scanner leer = new Scanner(System.in);

        String[] alumnos = new String[5];

        System.out.println("A continuación se deberá llenar los nombres de los alumnos: ");
        System.out.println("");

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre del alumno " + (i+1) + ".");
            String nombre = leer.nextLine();

            alumnos[i] = nombre;

        }

        c.setAlumnos(alumnos);
    }

    public void crearCurso(Curso c) {

        CursoServicios cs = new CursoServicios();

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el nombre del curso: ");
        c.setNombreCurso(leer.nextLine());

        System.out.println("Ingrese la cantidad de horas por día que tendrá el curso: ");
        c.setCantidadHorasPorDia(leer.nextInt());

        System.out.println("Ingrese la cantidad de días por semana que se realizará el curso: ");
        c.setCantidadDiasPorSemana(leer.nextInt());

        String turno;

        do {

            System.out.println("Ingrese si será en el turno de la manana (sin ñ) o la tarde: ");
            turno = leer.next();
            turno = turno.toLowerCase();

            if (turno.equals("manana") || turno.equals("tarde")) {
                c.setTurno(turno);
            } else {
                System.out.println("Opción inválida, intente nuevamente.");
            }

        } while (!turno.equals("manana") && !turno.equals("tarde"));

        System.out.println("Ingrese el precio por hora:");
        c.setPrecioPorHora(leer.nextInt());
        leer.nextLine(); // Consumir el carácter de nueva línea

        cs.cargarAlumnos(c);
    }

    public int calcularGananciaSemanal(Curso c) {

        //se deben multiplicar la cantidad de horas por día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
        int ganancia = c.getCantidadHorasPorDia() * c.getPrecioPorHora() * c.getCantidadDiasPorSemana() * c.getAlumnos().length;
             
        return ganancia;
    }
}
