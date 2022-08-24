/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class PerroServicio {
    
    private Scanner leer;
    private ArrayList<Perro> razas;
    
    public PerroServicio() {
        this.leer = new Scanner(System.in);
        this.razas = new ArrayList();
    }
            
    public void cargarRazas() {
        
        int opcion;
        
        do {
            leer.skip("\n");
            System.out.println("Ingrese la raza del perro: ");
            String raza = leer.nextLine();
            razas.add(new Perro(raza));
            
            System.out.println("");
            System.out.println("Elige una opcion:");
            System.out.println("1 - Guardar otro perro");
            System.out.println("2 - Salir al menú principal");
            opcion = leer.nextInt();
            
        } while (opcion != 2);        
    }
    
    public void mostrarPerros() {
        
        for (Perro aux : razas) {
            System.out.println(aux);
        }
    }
    
    /*
    Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
    */
    
    public void eliminarPerro() {
        
        Iterator<Perro> it = razas.iterator();
        int cont = 0;
        
        leer.skip("\n");
        System.out.println("Ingresar la raza del perro que desea eliminar:");
        String perroElim = leer.nextLine();
        
        while (it.hasNext()) {
            Perro aux = it.next();
            
            if (aux.getRaza().equals(perroElim)) {
                it.remove();
                cont++;
            }
        }
        
        if (cont == 0) {
            System.out.println("El perro no esta en la lista");
        }
        
        mostrarPerros();
    }
    
    public void menu() {
        int opcion;
        
        do {
            System.out.println("-----------------------------");
            System.out.println("1. Cargar perros");
            System.out.println("2. Mostrar lista de perros");
            System.out.println("3. Eliminar perro");
            System.out.println("4. Salir");
            opcion = leer.nextInt();
            System.out.println("-----------------------------");
            
            switch (opcion) {
                case 1: cargarRazas();
                        break;
                case 2: mostrarPerros();
                        break;
                case 3: eliminarPerro();
                        break;
                case 4: System.out.println("Salir");
                        break;
                default: System.out.println("Opcion no Válida");
                        break;
            }
            
        } while (opcion != 4);
    }
    

    
}
