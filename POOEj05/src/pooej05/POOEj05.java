/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package pooej05;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class POOEj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        CuentaServicios cs = new CuentaServicios();

        Cuenta c1 = cs.crearCuenta();

        String eleccion;

        do {
            System.out.println("");
            System.out.println("Menú principal:");
            System.out.println("");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Extracción Rápida");
            System.out.println("4. Consultar Saldo");
            System.out.println("5. Consultar Datos");
            System.out.println("6. Salir");
            System.out.println("");

            eleccion = leer.next();

            switch (eleccion) {
                case "1":
                    System.out.println("Ingrese el monto que desea depositar en su cuenta:");
                    double ingreso = leer.nextDouble();

                    cs.ingresar(ingreso, c1);

                    break;
                case "2":
                    System.out.println("Ingrese el monto que desea retirar de su cuenta:");
                    double retiro = leer.nextDouble();

                    cs.retirar(retiro, c1);
                    break;
                case "3":
                    System.out.println("Ingrese el monto que desea retirar de su cuenta en la modalidad de extracción rápida:");
                    retiro = leer.nextDouble();

                    cs.extraccionRapida(retiro, c1);
                    break;
                case "4":
                    cs.consultarSaldo(c1);
                    break;
                case "5":
                    cs.consultarDatos(c1);
                    break;
                case "6":
                    System.out.println("Gracias por usar nuestros servicios. Que tenga un buen día.");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }

        } while (!eleccion.equals("6"));

    }

}
