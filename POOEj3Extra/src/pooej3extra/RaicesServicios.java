/*
Luego, las operaciones que se podrán realizar son las siguientes:
 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c
 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.
 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.
 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones. 
 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.
 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package pooej3extra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class RaicesServicios {

    Raices r = new Raices(4, 3, 5);

    

    public void cargarCoeficientes() {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese el valor de A para la ecuación de segundo grado:");
        r.setA(leer.nextDouble());
        System.out.println("Ingrese el valor de B para la ecuación de segundo grado:");
        r.setB(leer.nextDouble());
        System.out.println("Ingrese el valor de C para la ecuación de segundo grado:");
        r.setC(leer.nextDouble());

    }

    public double getDiscriminante() {

        double discriminante = Math.pow((r.getB()), 2) - 4 * (r.getA()) * (r.getC());

        return discriminante;
    }

    public boolean tieneRaices() {

        double discriminante = getDiscriminante();
        boolean tieneRaices = false;

        if (discriminante > 0) {

            tieneRaices = true;
        }

        return tieneRaices;
    }

    public boolean tieneRaiz() {

        double discriminante = getDiscriminante();
        boolean unicaSolucion = false;

        if (discriminante == 0) {

            unicaSolucion = true;
        }

        return unicaSolucion;
    }

    public void obtenerRaices() {

        boolean tieneRaices = tieneRaices();
        double[] raices = new double[2];

        if (tieneRaices) {

            raices[0] = -(r.getB()) + Math.sqrt(Math.pow((r.getB()), 2) - 4 * (r.getA()) * (r.getC()));

            raices[1] = -(r.getB()) - Math.sqrt(Math.pow((r.getB()), 2) - 4 * (r.getA()) * (r.getC()));

            System.out.println("Raiz 1: " + raices[0]);
            System.out.println("");
            System.out.println("Raiz 2: " + raices[1]);

        }
    }

    public void obtenerRaiz() {

        boolean tieneRaiz = tieneRaiz();
        double raiz;

        if (tieneRaiz) {

            raiz = -(r.getB()) + Math.sqrt(Math.pow((r.getB()), 2) - 4 * (r.getA()) * (r.getC()));

            System.out.println("La raiz es: " + raiz);
        }

    }

    public void calcular() {

        boolean tieneRaices = tieneRaices();
        boolean tieneRaiz = tieneRaiz();

        if (tieneRaices) {
            obtenerRaices();
        } else if (tieneRaiz) {
            obtenerRaiz();
        } else {
            System.out.println("No existe una solucion para la ecuacion.");
        }
    }
}
