/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej2extra;


/**
 *
 * @author Invitado
 */
public class POOEj2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       PuntosServicios ps = new PuntosServicios();
        
        ps.crearPuntos();
        
        double distancia = ps.calcularDistancia();
        
        System.out.println("");
        System.out.println("La distancia entre el punto 1 y el punto 2 es " + distancia);
        
    }
    
}
