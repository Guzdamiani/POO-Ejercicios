/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package pooej1extra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class POOEj1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        Cancion c1 = new Cancion();

        System.out.println("Ingrese el título de su canción preferida:");
        c1.setTitulo(leer.nextLine());

        System.out.println("Ingrese el autor de dicha canción:");
        c1.setAutor(leer.nextLine());
        
        System.out.println(c1.toString());

    }

}
