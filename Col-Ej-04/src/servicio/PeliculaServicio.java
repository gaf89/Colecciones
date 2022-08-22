/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import utilidades.Comparadores;

/**
 *
 * @author Gaston
 */
/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
*/
public class PeliculaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    ArrayList<Pelicula> peliculas = new ArrayList();
    
    public void crearPeliculas() {
        String resp, titulo, director;
        int duracion;
        
        
        do {
        
            System.out.println("Ingresar Título de la Película:");
            titulo = leer.nextLine();
            System.out.println("Ingresar Director de la Película:");
            director = leer.nextLine();
            System.out.println("Ingresar duración de la Película:");
            duracion = leer.nextInt();
            
            Pelicula nuevaPelicula = new Pelicula(titulo, director, duracion);
            
            peliculas.add(nuevaPelicula);
            
            System.out.println("¿Quiere crear otra película?(si/no)");
            resp = leer.next();
            leer.skip("\n");
            System.out.println("");
        } while (resp.equals("si"));
        
    }
    
    
    //• Mostrar en pantalla todas las películas.
    
    public void mostrarPeliculas() {
        
        System.out.println("Lista de Peliculas");
        
        for (Pelicula aux : peliculas) {
            System.out.println("Título: "+aux.getTitulo()+"    Director: "+aux.getDirector()+"   Duracion: "+aux.getDuracion()+" hr/s");
        }
    }

    //• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    
    public void mostrarPeliculasMas1Hora() {
        
        System.out.println("Peliculas con una duración mayor a 1 hora");
        
        for (Pelicula aux : peliculas) {
            if (aux.getDuracion() > 1)
            System.out.println("Título: "+aux.getTitulo()+"    Director: "+aux.getDirector()+"   Duracion: "+aux.getDuracion()+" hr/s");
        }
    }
    
//    • Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    
    public void ordenarPorDuracionDesc() {
        
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionDesc);
        
        System.out.println("Películas Ordenadas por su duracion (de mayor a menor)");
        
        mostrarPeliculas();
    }
    
//    • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
    
    
    public void ordenarPorDuracionAsce() {
        
        Collections.sort(peliculas, Comparadores.ordenarPorDuracionAsce);
        
        System.out.println("Películas Ordenadas por su duracion (de menor a mayor)");
        
        mostrarPeliculas();
    }
     
//     • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
     
    public void ordenarPorTituloAlfa() {
        
        Collections.sort(peliculas, Comparadores.ordenarPorTituloAlfa);
        
        System.out.println("Películas Ordenadas por su títuloa alfabéticamente");
        
        mostrarPeliculas();
    }
     
//  • Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.  
     
    public void ordenarPorDirectorAlfa() {
        
        Collections.sort(peliculas, Comparadores.ordenarPorDirectorAlfa);
        
        System.out.println("Películas Ordenadas por su director alfabéticamente");
        
        mostrarPeliculas();
    }
     
}
