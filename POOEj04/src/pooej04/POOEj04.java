/*
 Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package pooej04;

import Rectangulo.Rectangulo;
import Rectangulo.RectanguloServicios;

/**
 *
 * @author Invitado
 */
public class POOEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        RectanguloServicios rs = new RectanguloServicios();

        Rectangulo r1 = rs.crearRectangulo();

        int perimetro = rs.perimetroRectangulo(r1);

        int area = rs.areaRectangulo(r1);

        rs.dibujarRectangulo(r1);

        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("Perímetro: " + perimetro);
        System.out.println("Área: " + area);

    }

}
