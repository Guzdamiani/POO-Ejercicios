/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej09;

/**
 *
 * @author Invitado
 */
public class MatematicaServicios {

    public void devolverMayor(Matematica m) {

        System.out.println("El numero 1 es: " + m.getNum1());
        System.out.println("El numero 2 es: " + m.getNum2());

        if (m.getNum1() > m.getNum2()) {
            System.out.println("El número 1 es mayor que el número 2.");
        } else if (m.getNum2() > m.getNum1()) {
            System.out.println("El número 2 es mayor que el número 1.");

        } else {
            System.out.println("Los números son iguales.");
        }

    }

    public double calcularPotencia(Matematica m) {

        double num1Round = Math.round(m.getNum1());
        double num2Round = Math.round(m.getNum2());
        double potencia;

        if (num1Round >= num2Round) {
            potencia = Math.pow(num1Round, num2Round);
        } else {
            potencia = Math.pow(num2Round, num1Round);
        }

        return potencia;
    }

    public double calcularRaiz(Matematica m) {

        double num1Abs = Math.abs(m.getNum1());
        double num2Abs = Math.abs(m.getNum2());
        double raiz;

        if (num1Abs >= num2Abs) {
            raiz = Math.sqrt(num2Abs);
        } else {
            raiz = Math.sqrt(num1Abs);
        }
        
        return raiz;
    }
}
