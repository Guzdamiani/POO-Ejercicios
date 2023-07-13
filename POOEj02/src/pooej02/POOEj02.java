/*
 Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package pooej02;

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicios;

/**
 *
 * @author Invitado
 */
public class POOEj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CircunferenciaServicios cs = new CircunferenciaServicios();

        Circunferencia c = cs.crearCircunferencia();

        double radio = c.getRadio();

        double area = cs.areaCircunferencia(radio);

        double perimetro = cs.perimetroCircunferencia(radio);

        System.out.println("El radio de la circunferencia es " + c.getRadio() + "cm");
        System.out.println("El perímetro de la circunferencia es " + perimetro + "cm");
        System.out.println("El área de la circunferencia es " + area + "cm");

    }

}
