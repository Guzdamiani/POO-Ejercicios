/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej06;

/**
 *
 * @author Invitado
 */
public class CafeteraServicios {

    public void llenarCafetera(Cafetera c) {

        c.setCantidadActual(c.getCapacidadMaxima());
        
        System.out.println("La cafetera se ha llenado con éxito. Ahora posee " + c.getCantidadActual() + "ml.");

    }

    public void servirTaza(int taza, Cafetera c) {

        if (taza <= c.getCantidadActual()) {
            
            c.setCantidadActual(c.getCantidadActual() - taza);
            System.out.println("La taza se lleno con " + taza + "ml de café.");
            
        } else {
            
            System.out.println("La taza no se ha podido llenar. Se le han vertido los " + c.getCantidadActual() + "ml de café que quedaban en la cafetera.");
            c.setCantidadActual(0);
        }

    }
    
    public void vaciarCafetera(Cafetera c) {
        
        c.setCantidadActual(0);
        
        System.out.println("Se ha vaciado la cafetera.");
        
    }
    
    public void agregarCafe(int cafe, Cafetera c) {
        
        if (c.getCantidadActual() + cafe > c.getCapacidadMaxima()) {
            
            c.setCantidadActual(c.getCapacidadMaxima());
            
            System.out.println("La cantidad deseada estaría desbordando la cafetera. Se han agregado los " + (c.getCapacidadMaxima() - c.getCantidadActual()) + "ml necesarios para llenar la cafetera y se ha descartado el resto.");
            
        } else {
            
            c.setCantidadActual(c.getCantidadActual()+ cafe);
            System.out.println("Se han agregado los " + cafe + "ml a la cafetera. La misma posee ahora " + c.getCantidadActual() + "ml.");
        }
    }
}
