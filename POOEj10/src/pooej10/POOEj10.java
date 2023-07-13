/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package pooej10;

import java.util.Arrays;

/**
 *
 * @author Invitado
 */
public class POOEj10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[] arregloA = new double[50];
        double[] arregloB = new double[20];

        //Llenar arregloA e imprimirlo en pantalla
        
        for (int i = 0; i < 50; i++) {
            arregloA[i] = Math.random() * 10;
        }
        
        System.out.println("El arreglo A es el siguiente:");
        System.out.println("");
        System.out.println(Arrays.toString(arregloA));
        
        //Ordenar de menor a mayor
        
        Arrays.sort(arregloA);
        
        System.arraycopy(arregloA, 0, arregloB, 0, 10);
        Arrays.fill(arregloB, 10, 20, 0.5);
        
        System.out.println("El arreglo A es el siguiente:");
        System.out.println("");
        System.out.println(Arrays.toString(arregloA));
        
        System.out.println("");
        
        System.out.println("El arreglo B es el siguiente:");
        System.out.println("");
        System.out.println(Arrays.toString(arregloB));
    }

}
