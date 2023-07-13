/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4extra;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class NIFServicios {
 
    NIF n = new NIF();
    
    public void crearNif() {
        
       Scanner leer = new Scanner(System.in);
        
        String[] tabla =  {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String letra;
        int resto;
        
        System.out.println("Ingrese su DNI");
        n.setDNI(leer.nextLong());
        
        resto = Math.round((n.getDNI() % 23));
        
        letra = tabla[resto];
        
        n.setLetra(letra);
    }
    
    public void mostrar() {
        
        System.out.println("NIF:");
        System.out.println("");
        System.out.println("DNI: " + n.getDNI());
        System.out.println("Letra correspondiente: " + n.getLetra());
        
        System.out.println("Gracias.");
    }
}
