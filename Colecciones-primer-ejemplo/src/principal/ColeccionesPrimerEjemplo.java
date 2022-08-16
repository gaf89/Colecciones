/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import servicio.MascotaServicio;

/**
 *
 * @author Gaston
 */
public class ColeccionesPrimerEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
//        String[] nombresArray = new String[5];
//        
//        for (int i = 0; i < nombresArray.length; i++) {
//            nombresArray[i] = "Chiquitin " + (i + 1);
//        }
//        
//        for (String var: nombresArray) {
//            System.out.println(var);
//        }
//        
//        
//        ArrayList<String> nombresArrayList = new ArrayList();
//        
//        nombresArrayList.add("Chiquito");
//        nombresArrayList.add("Chiquito");
//        nombresArrayList.add("Chiquito");
//                
//        System.out.println(nombresArrayList.size());
//        
//        nombresArrayList.remove("Chiquito");
//        
//        System.out.println(nombresArrayList.size());
//        
//        
     MascotaServicio servMasc = new MascotaServicio();
//        
//        servMasc.fabricaMascotas(2);
//        
//        servMasc.mostrarMascota();
//        
//        servMasc.actualizarMascota(0);
//        
//        servMasc.mostrarMascota();
//        
//        servMasc.actualizarMascota2(0);
//        
//        servMasc.mostrarMascota();
//        
//        servMasc.eliminarMascota(3);
//        
//        servMasc.mostrarMascota();
//        
//        
//        String[] nombres = {"Pepe", "Pepa"};
//        
//        List <String> nombresList = new ArrayList(Arrays.asList(nombres));
//        
//        List <String> nombresList2 = new ArrayList();
//        
//        nombresList2.addAll(nombresList);

//        List<String> nombres = new ArrayList();
//        nombres.add("Lola");
//        nombres.add("Rodman");
//        nombres.add("Chiquito");
//        
//        for (String aux : nombres) {
//            System.out.println(aux);
//        }
//        
//        for (int i = 0; i < nombres.size(); i++) {
//            System.out.println(nombres.get(i));
//        }
//        
//        nombres.forEach((e)->System.out.println(e));
//        
//        for (String aux : nombres) {
//            if (aux.equals("Lola")) {
//                nombres.remove(aux);
//            }
//        }
//        
//        for (int i = 0; i < nombres.size(); i++) {
//            
//            String m = nombres.get(i);
//            if (m.equals("Lola")) {
//                nombres.remove(m);
//            }
//        }
//        
//        nombres.forEach((e)->System.out.println(e));
//        
//        Iterator<String> it = nombres.iterator();
//        
//        while (it.hasNext()) {
//            String aux = it.next();
//            
//            if (aux.equals("Rodman")){
//                it.remove();
//            }                
//        }
//        
//        nombres.forEach((e)->System.out.println(e));
//        
        

        servMasc.fabricaMascotas(1);
        
        servMasc.actualizarMascotaPorApodo("Luci", "Lola");
        
        servMasc.mostrarMascota();
        
        servMasc.eliminarPorApodo("Lola");
        
        servMasc.mostrarMascota();


    }
    
}
