/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class OperacionServicios {

    public Operacion crearOperacion() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un número:");
        int num1 = leer.nextInt();

        System.out.println("Ingrese otro número:");
        int num2 = leer.nextInt();

        return new Operacion(num1, num2);
    }

    public int sumar(Operacion o) {

        int num1 = o.getNum1();
        int num2 = o.getNum2();

        int suma = num1 + num2;

        return suma;
    }

    public int restar(Operacion o) {

        int num1 = o.getNum1();
        int num2 = o.getNum2();

        int resta = num1 - num2;

        return resta;
    }

    public int multiplicar(Operacion o) {

        int num1 = o.getNum1();
        int num2 = o.getNum2();
        int multi;

        if (num1 != 0 && num2 != 0) {

            multi = num1 * num2;

        } else {

            multi = 0;
            System.out.println("Uno de los números, o ambos, son 0.");
        }

        return multi;
    }

    public double dividir(Operacion o) {

        int num1 = o.getNum1();
        int num2 = o.getNum2();
        double div;

        if (num2 != 0) {

            div = (double) (num1 / num2);

        } else {

            div = 0;
            System.out.println("No se puede dividir por cero.");
        }

        return div;
    }
}
