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
public class POOEj09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Matematica m = new Matematica();
        MatematicaServicios ms = new MatematicaServicios();

        double num1 = Math.random() * 10;
        double num2 = Math.random() * 10;

        m.setNum1(num1);
        m.setNum2(num2);

        ms.devolverMayor(m);
        System.out.println("");

        double potencia = ms.calcularPotencia(m);

        if (m.getNum1() >= m.getNum2()) {
            System.out.println("La potencia de " + Math.round(m.getNum1()) + " ^ " + Math.round(m.getNum2()) + " es " + potencia);
        } else {
            System.out.println("La potencia de " + Math.round(m.getNum2()) + " ^ " + Math.round(m.getNum1()) + " es " + potencia);
        }

        System.out.println("");

        double raiz = ms.calcularRaiz(m);

        if (m.getNum1() >= m.getNum2()) {
            System.out.println("La raiz cuadrada de " + Math.abs(m.getNum2()) + " es " + raiz);
        } else {
            System.out.println("La raiz cuadrada de " + Math.abs(m.getNum1()) + " es " + raiz);
        }
    }

}
