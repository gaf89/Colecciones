/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Mascota;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class MascotaServicio {
    
    private Scanner leer;
    //private ArrayList<String> mascotas;
    private ArrayList<Mascota> mascotas;
    
    public MascotaServicio() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
    
    /*
    public void crearMascota(){
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        System.out.println("Introducir edad");
        int edad = leer.nextInt();
        
        String mascota = apodo+" "+tipo+" "+edad;
        
        mascotas.add(mascota);        
    }
    */
    
    public Mascota crearMascota(){
        
        System.out.println("Introducir apodo");
        String apodo = leer.next();
        
        System.out.println("Introducir tipo");
        String tipo = leer.next();
        
        System.out.println("Introducir edad");
        int edad = leer.nextInt();
        
                       
        return new Mascota(apodo, tipo, edad);
    }
    
    public void agregarMascota(Mascota m) {
        mascotas.add(m);
    }
    
    
    /*
    public void mostrarMascota() {
        
        System.out.println("Las mascotas actuales de la Lista son");
        for(String aux : mascotas) {
            System.out.println(aux);
        }
        System.out.println("cantidad = "+mascotas.size());
    }
    */
    
    public void mostrarMascota() {
        
        System.out.println("Las mascotas actuales de la Lista son");
        for(Mascota aux : mascotas) {
            System.out.println(aux.toString());
        }
        System.out.println("cantidad = "+mascotas.size());
    }
    
    public void fabricaChiquitos(int cantidad) {
        
        for (int i = 0; i < cantidad; i++) {
            mascotas.add(new Mascota("Chiquitos", "mestiso", 8));
        }
    }
    
    public void fabricaMascotas(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Mascota mascotaCreada = crearMascota();
            
            agregarMascota(mascotaCreada);
            
            System.out.println(mascotaCreada.toString());
        }
    }
    
    public void actualizarMascota(int index) {
        Mascota m = mascotas.get(index);
        m.setApodo("Roberto");
    }
    
    public void actualizarMascota2(int index) {
        Mascota m = crearMascota();
        
        mascotas.set(index, m);
    }
    
    public void actualizarMascota3(int index) {
        
        if (index <= mascotas.size()-1){
        
            System.out.println("");
            System.out.println("---------Actualizar---------");
            
            Mascota m = crearMascota();
        
            mascotas.set(index, m);
        } else {
            System.out.println("Fallo al actualizar, El indice es erroneo");
        }
    }
    
    
    public void eliminarMascota(int index) {
        
        if (index <= mascotas.size()-1){
        
            System.out.println("");
            System.out.println("---------Eliminar---------");
            
            mascotas.remove(index);
        } else {
            System.out.println("Fallo al eliminar, El indice es erroneo");
        }
    }
    
    public void eliminarPorApodo(String apodo) {
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            
            if (m.getApodo().equals(apodo)){
                mascotas.remove(i);
            }
        }
    }
    
    public void actualizarMascotaPorApodo(String apodoViejo, String apodoNuevo) {
        
        for (int i = 0; i < mascotas.size(); i++) {
            
            Mascota m = mascotas.get(i);
            
            if (m.getApodo().equals(apodoViejo)){
                m.setApodo(apodoNuevo);
            }
        }
    }
}
