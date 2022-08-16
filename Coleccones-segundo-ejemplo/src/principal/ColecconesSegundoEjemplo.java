/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import entidad.Mascota;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import utilidades.comparadores;

/**
 *
 * @author Gaston
 */
public class ColecconesSegundoEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        HashSet<String> nombres = new HashSet();
//        
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//        nombres.add("Chiquito");
//        
//        for (String nombre : nombres) {
//            System.out.println(nombre);
//        }
        
        
//        TreeSet<Mascota> mascotas = new TreeSet();
//      
//        
//        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota("Fer", "Chiquito", "Perro"));
//        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
//        mascotas.add(new Mascota("Pepa", "Lola", "Gato"));
//        
//        //Collections.sort(mascotas, comparadores.ordenarPorNombreDesc);
//        
//        //Collections.shuffle(mascotas);
//        
//        for (Mascota mascota : mascotas) {
//            System.out.println(mascota);
//        }
                

//        HashMap<Integer, String> nombres = new HashMap();
//        
//        nombres.put(1, "Chiquito");
//        nombres.put(2, "Lola");
//         for (Map.Entry<Integer, String> aux : nombres.entrySet()) {
//            Integer key = aux.getKey();
//            String value = aux.getValue();
//            
//            System.out.println("key "+key+" value "+value);
//        }
        
        HashMap<String, Mascota> mascotas = new HashMap();
        
        mascotas.put("1", new Mascota("Fer", "Chiquito", "Perro"));
        mascotas.put("2", new Mascota("Pepa", "Lola", "Gato"));
        
        mascotas.remove("1");
                
        
       

    }
    
}
