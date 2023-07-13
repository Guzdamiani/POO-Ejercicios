/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main. 
 */
package pooej6extra;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class AhorcadoServicios {

    Ahorcado a = new Ahorcado();

    public void crearJuego() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la palabra a ser descubierta:");
        String eleccion = leer.next();

        System.out.println("Ingrese la cantidad máxima de jugadas que desea que tenga el jugador:");
        int maxJugadas = leer.nextInt();

        String[] palabra = new String[eleccion.length()];

        for (int i = 0; i < eleccion.length(); i++) {
            palabra[i] = eleccion.substring(i, i + 1);
        }

        a.setPalabra(palabra);
        a.setMaxJugadas(maxJugadas);

    }

    public int longitud() {

        int longitud = (a.getPalabra()).length;

        return longitud;
    }

    public void buscar(String letra) {

        String[] palabra = a.getPalabra();
        boolean encontrada = false;

        for (int i = 0; i < longitud(); i++) {

            if (palabra[i].equals(letra)) {

                encontrada = true;
                break;
            }
        }

        if (encontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }
    }

    public int encontradas(String letra, String[] arregloVacio) {

        String[] palabra = a.getPalabra();
        int vecesEncontrada = 0;

        for (int i = 0; i < longitud(); i++) {

            if (palabra[i].equals(letra)) {

                vecesEncontrada++;
                arregloVacio[i] = letra;
            }
        }

        if (vecesEncontrada == 0) {
            a.setMaxJugadas(a.getMaxJugadas() - 1);
        }

        return vecesEncontrada;
    }

    public void juego() {

        Scanner leer = new Scanner(System.in);

        String[] arregloVacio = new String[longitud()];

        for (int i = 0; i < longitud(); i++) {

            arregloVacio[i] = "_";
        }

        
        
        System.out.println("Que comience el juego:");
        System.out.println("");

        System.out.print("\033[H\033[2J");
        System.out.flush();
        
        int letrasEncontradas = 0;

        do {

            System.out.println("Ingrese una letra");
            String letra = leer.next();
            System.out.println("Longitud de la palabra: " + longitud());

            buscar(letra);

            letrasEncontradas += encontradas(letra, arregloVacio);
            System.out.println("Número de letras (encontradas, faltantes): (" + letrasEncontradas + "," + (longitud() - letrasEncontradas) + ").");
            System.out.println("Oportunidades restantes: " + a.getMaxJugadas());
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println(Arrays.toString(arregloVacio));
            System.out.println("");

        } while (a.getMaxJugadas() > 0 && letrasEncontradas != longitud());

        if (a.getMaxJugadas() == 0) {
            System.out.println("Lamentablemente se han acabado las oportunidades. Has perdido...");
        } else {
            System.out.println("Felicitaciones! Has descubierto la palabra!");
        }
    }
}
