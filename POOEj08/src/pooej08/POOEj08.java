/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada.
 */
package pooej08;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class POOEj08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CadenaServicios cs = new CadenaServicios();
        Cadena c = new Cadena();

        System.out.println("Ingrese una frase o palabra:");
        c.setCadena(leer.nextLine());

        c.setLongitud(c.getCadena().length());

        cs.mostrarVocales(c);

        System.out.println("");

        cs.invertirFrase(c);

        System.out.println("");
        System.out.println("");

        String letra;

        do {

            System.out.println("Ingrese un caracter:");
            letra = leer.next();

            if (letra.length() != 1) {
                System.out.println("Ingreso inválido. Debe ingresar solamente un caracter.");
                System.out.println("Intente nuevamente:");
            }

        } while (letra.length() != 1);

        cs.vecesRepetido(letra, c);
        System.out.println("");

        System.out.println("A continuación se reemplazaran todas las ´a´ de la cadena por el caracter " + letra);
        System.out.println("Ingrese C para continuar");
        String continuar = leer.next();

        cs.reemplazar(letra, c);
        System.out.println("");

        System.out.println("A continuación se comprobará si la letra " + letra + " se encuentra en la cadena");
        System.out.println("Ingrese C para continuar");
        continuar = leer.next();

        boolean esta;

        esta = cs.contiene(letra, c);

        leer.nextLine();

        System.out.println("");
        System.out.println("Ingrese una nueva frase:");
        String frase = leer.nextLine();

        cs.compararLongitud(frase, c);
        System.out.println("");

        cs.unirFrases(frase, c);
        System.out.println("");

    }

}
