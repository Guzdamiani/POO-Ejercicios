/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package pooej5extra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class POOEj5Extra {

    public static void main(String[] args) {

        Meses m = new Meses();
        Scanner leer = new Scanner(System.in);

        System.out.println("Intente adivinar el mes secreto. Asegurese de ingresar el mes en minúscula.");
        String eleccion;
        
        do {
            eleccion = leer.next();
            
            if (eleccion.equals(m.getMesSecreto())) {

                System.out.println("Felicitaciones, has acertado. El mes secreto es " + m.getMesSecreto());
            } else {

                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes:");
            }

        } while (!eleccion.equals(m.getMesSecreto()));

    }
}
