/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej05;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class CuentaServicios {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {

        Cuenta c = new Cuenta();

        System.out.println("Ingrese su DNI, sin puntos ni guiones:");
        c.setDni(leer.nextLong());
        System.out.println("Ingrese el saldo que desea depositar por primera vez:");
        c.setSaldoActual(leer.nextInt());
        c.setNumeroCuenta((int) (Math.random() * 100000));
        System.out.println("Su numero de cuenta es: " + c.getNumeroCuenta());

        return c;
    }

    public void ingresar(double ingreso, Cuenta c) {

        double saldoNuevo = c.getSaldoActual() + ingreso;

        c.setSaldoActual((int) saldoNuevo);

        System.out.println("Operacion realizada con éxito. Nuevo saldo: " + c.getSaldoActual() + "$");
    }

    public void retirar(double retiro, Cuenta c) {

        if (c.getSaldoActual() >= retiro) {

            double saldoNuevo = c.getSaldoActual() - retiro;

            c.setSaldoActual((int) saldoNuevo);

            System.out.println("Operacion realizada con éxito. Nuevo saldo: " + c.getSaldoActual() + "$");

        } else {

            c.setSaldoActual(0);

            System.out.println("El monto de retiro supera el saldo actual. Su nuevo saldo es " + 0);

        }

    }

    public void extraccionRapida(double retiro, Cuenta c) {

        CuentaServicios cs = new CuentaServicios();

        if (retiro <= (c.getSaldoActual() * 0.2)) {
            cs.retirar(retiro, c);
        } else {
            System.out.println("El monto de retiro ingresado supera el 20% del saldo actual permitido para este tipo de extracciones. No se puede realizar la operación.");
        }
    }

    public void consultarSaldo(Cuenta c) {

        System.out.println("¿Desea conocer su saldo actual? Conteste s/n");
        String respuesta = (leer.next()).toLowerCase();

        if (respuesta.equals("s")) {

            System.out.println("Su saldo es de " + c.getSaldoActual() + "$");

        }
    }

    public void consultarDatos(Cuenta c) {

        System.out.println("¿Desea conocer la información de su cuenta? Conteste s/n");
        String respuesta = (leer.next()).toLowerCase();

        if (respuesta.equals("s")) {

            System.out.println("Nº de cuenta: " + c.getNumeroCuenta());
            System.out.println("DNI: " + c.getDni());
            System.out.println("Saldo: " + c.getSaldoActual() + "$");

        }
    }

}
