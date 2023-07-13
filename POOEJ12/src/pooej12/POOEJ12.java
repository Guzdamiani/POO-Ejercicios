/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package pooej12;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class POOEJ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Persona p = new Persona();
        PersonaServicios ps = new PersonaServicios();
        
        ps.crearPersona(p);
        
        int edadP = ps.calcularEdad(p);
        System.out.println("La persona tiene " + edadP + " años.");
        
        System.out.println("Ingrese una edad para comparar con la de la persona:");
        int edad = leer.nextInt();
        
        boolean menor = ps.menorQue(edad, p);
        
        if (menor) {
            System.out.println("La persona es menor que la edad que acabas de ingresar.");
        } else {
            System.out.println("La persona es mayor, o su edad es igual a la que acabas de ingresar.");
        }
        
        System.out.println("");
        
        ps.mostrarPersona(p);
    }
    
}
