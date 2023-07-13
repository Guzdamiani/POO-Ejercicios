/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class MovilServicios {
    
    Scanner leer = new Scanner(System.in);
    
    Movil m = new Movil();
    
    public Movil cargarCelular() {
        
        System.out.println("Ingrese la marca del movil:");
        m.setMarca(leer.nextLine());
        
        System.out.println("Ingrese el precio en USD:");
        m.setPrecio(leer.nextInt());
        
        leer.nextLine();
        
        System.out.println("Ingrese el modelo:");
        m.setModelo(leer.nextLine());
        
        System.out.println("Ingrese la memoria RAM en GB:");
        m.setMemoriaRam(leer.nextInt());
        
        System.out.println("Ingrese el almacenamiento en GB:");
        m.setAlmacenamiento(leer.nextInt());
        
        ingresarCodigo();
         
         return m;
    } 
    
    
    public void ingresarCodigo() {
        
        int[] code = new int[7];
        
        for (int i = 0; i < 7; i++) {
            
            System.out.println("Ingrese el numero para la posición " + i + " del código.");
            code[i] = leer.nextInt();
        }
        
         m.setCodigo(code);   
    }
    
    public void mostrarCelular() {
        
        System.out.println("Información del celular:");
        System.out.println("");
        System.out.println("Marca: " + m.getMarca());
        System.out.println("Precio: " + m.getPrecio() + "$USD.");
        System.out.println("Modelo: " + m.getModelo());
        System.out.println("Memoria RAM: " + m.getMemoriaRam() + "GB.");
        System.out.println("Almacenamiento: " + m.getAlmacenamiento() + "GB.");
        System.out.println("Codigo: " + Arrays.toString(m.getCodigo()));
   
    }
}
