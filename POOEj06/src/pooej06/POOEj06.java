/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package pooej06;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class POOEj06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Cafetera c1 = new Cafetera(500, 150);
        CafeteraServicios cs = new CafeteraServicios();

        String eleccion;

        do {
            System.out.println("");
            System.out.println("Menú principal:");
            System.out.println("");
            System.out.println("1. Llenar Cafetera");
            System.out.println("2. Servir Taza");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar Cafe");
            System.out.println("5. Salir");
            System.out.println("");

            eleccion = leer.next();

            switch (eleccion) {
                case "1":
                    cs.llenarCafetera(c1);
                    break;
                case "2":
                    System.out.println("Ingrese el tamaño (en ml) de la taza que desea llenar:");
                    int taza = leer.nextInt();

                    cs.servirTaza(taza, c1);

                    break;
                case "3":
                    cs.vaciarCafetera(c1);
                    break;
                case "4":

                    if (c1.getCantidadActual() == c1.getCapacidadMaxima()) {
                        System.out.println("No se puede agregara café. La cafeterea ya está llena.");
                    } else {

                        System.out.println("¿Cuánto café (en ml) desea agregar a la cafetera?");
                        int cafe = leer.nextInt();
                        cs.agregarCafe(cafe, c1);
                    }
                    break;
                case "5":
                    System.out.println("Gracias por usar nuestros servicios. Que tenga un buen día.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (!eleccion.equals("5"));

    }

}
