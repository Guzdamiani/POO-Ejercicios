/*
 En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package pooej11;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class POOEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Se le solicitará información para llenar una fecha");
        System.out.println("");

        int anio;
        int mes;
        int dia;

        do {
            System.out.println("Año:");
            anio = leer.nextInt();
            if (anio < 0 || anio > 3000) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (anio < 0 || anio > 3000);

        do {
            System.out.println("Mes:");
            mes = leer.nextInt();
            if (mes < 1 || mes > 12) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (mes < 1 || mes > 12);

        do {
            System.out.println("Día:");
            dia = leer.nextInt();
            if (dia < 1 || dia > 31) {
                System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (dia < 1 || dia > 31);

        LocalDate fecha = LocalDate.of(anio, mes, dia);
        LocalDate fechaActual = LocalDate.now();

        System.out.println("Fecha ingresada: " + fecha);
        System.out.println("Fecha actual: " + fechaActual);

        if (fecha.isAfter(fechaActual)) {
            System.out.println("La fecha ingresada es " + (fecha.getYear() - fechaActual.getYear()) + " años después de la fecha actual.");
        } else if (fecha.isBefore(fechaActual)) {
            System.out.println("La fecha ingresada es " + (fechaActual.getYear() - fecha.getYear()) + " años antes de la fecha actual. ");
        } else {
            System.out.println("La fecha ingresada es igual a la fecha actual.");
        }

    }

}
