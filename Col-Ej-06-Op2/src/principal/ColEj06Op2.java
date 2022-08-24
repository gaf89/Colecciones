/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import servicio.ProductoServicio;

/**
 *
 * @author Gaston
 */
public class ColEj06Op2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
         
        ProductoServicio ps = new ProductoServicio();
        
        int opcion;
        
        do {
        
            opcion = ps.menu();
        
        } while (opcion != 5);
     
    }
    
}
