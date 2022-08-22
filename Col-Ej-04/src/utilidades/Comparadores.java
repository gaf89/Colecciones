/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Gaston
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracionDesc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
    
    public static Comparator<Pelicula> ordenarPorDuracionAsce = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
        
    public static Comparator<Pelicula> ordenarPorTituloAlfa = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
            return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
        
    public static Comparator<Pelicula> ordenarPorDirectorAlfa = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           
            return t.getDirector().compareTo(t1.getDirector());
        }
    };
        
        
}
