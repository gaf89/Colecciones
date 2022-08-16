/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Mascota;
import java.util.Comparator;

/**
 *
 * @author Gaston
 */
public class comparadores {
    
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1) {
           
            return t1.getNombre().compareTo(t.getNombre());            
        }
    };
    
    public static Comparator<Mascota> ordenarPorEdadDesc = new Comparator<Mascota> () {
        @Override
        public int compare(Mascota t, Mascota t1) {
           
            return t1.getEdad().compareTo(t.getEdad());            
        }
    };
            
}
