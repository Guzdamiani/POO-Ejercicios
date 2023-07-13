/*
Se está realizando una calculadora grafica, y se requiere calcular algunas áreas y perímetros de unas figuras
geométricas. 
El usuario debe elegir la figura geométrica, luego debe ingresar el/los dato/s de la figura geométrica elegida y le debe
mostrar por pantalla el área y el perímetro.
Aclaración: Si el usuario elige una figura, se debe crear un objeto de esa figura seleccionada, y realizar los cálculos
para luego mostrar en pantalla.
 */
package ej2desafio;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Ej2Desafio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        FiguraServicios fs = new FiguraServicios();
        Figura f1 = new Figura();

       
        System.out.println("Ingrese el nombre de una figura geométrica:");
        f1.nombre = leer.next();
        
        
        fs.perimetroAreaFigura(f1.nombre);
        
    }

}
