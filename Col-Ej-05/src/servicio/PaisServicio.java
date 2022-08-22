/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Gaston
 */
/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
*/
public class PaisServicio {
    
    Scanner leer = new Scanner(System.in);
    
    TreeSet<Pais> paises = new TreeSet();
    
    public void cargarPaises() {
        
        String resp, nombre;
        
        do {
            System.out.println("Ingresar un país");
            nombre = leer.next();
            
            Pais p1 = new Pais(nombre);
            
            paises.add(p1);
                        
            System.out.println("¿Quiere guardar otro país?(si/no)");
            resp = leer.next();
        } while (resp.endsWith("si"));
    }
    
    public void mostrarPaises() {
        
        System.out.println("Listado de Paises");
        for (Pais aux : paises) {
            System.out.println(aux.getNombre());
        }
        
    }
    
//    Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
    
    public void eliminarPais() {
        
        Iterator<Pais> it = paises.iterator();
        
        boolean encontrado = false;
        
        System.out.println("Ingresar el País a eliminar");
        String nombre = leer.next();
        
        while (it.hasNext()) {
            Pais aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                it.remove();
                encontrado = true;
            }
        }
        
        if (encontrado) {
            System.out.println("El País "+nombre+" ha sido eliminado");
        } else {
            System.out.println("No se ha encontrado el País");
        }
        
        System.out.println("");
        mostrarPaises();
    }
    
   
}
