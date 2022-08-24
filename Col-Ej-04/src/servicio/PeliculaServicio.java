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
    
    private Scanner leer;
    private ArrayList<Pelicula> peliculas;
    
    public PeliculaServicio() {
        this.leer = new Scanner(System.in);
        this.peliculas = new ArrayList();
    }
    public void crearPeliculas() {
        String resp, titulo, director;
        int duracion;
        
        
        do {
            leer.skip("\n");
            System.out.println("Ingresar Título de la Película:");
            titulo = leer.nextLine();
            System.out.println("Ingresar Director de la Película:");
            director = leer.nextLine();
            System.out.println("Ingresar duración de la Película:");
            duracion = leer.nextInt();
                        
            peliculas.add(new Pelicula(titulo, director, duracion));
            
            System.out.println("¿Quiere crear otra película?(si/no)");
            resp = leer.next();
            
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
     
    public void menu() {
        int opcion;
        
        do {
            System.out.println("--------------------------------------------------------");
            System.out.println("1. Cargar Películas");
            System.out.println("2. Mostrar Películas");
            System.out.println("3. Mostrar Películas con una duración mayor a 1 hora");
            System.out.println("4. Ordenar Películas por su duración (de mayor a menor)");
            System.out.println("5. Ordenar Películas por su duración (de menor a mayor)");
            System.out.println("6. Ordenar Películas por su títuloa alfabéticamente");
            System.out.println("7. Ordenar Películas por su director alfabéticamente");
            System.out.println("8. Salir");
            opcion = leer.nextInt();
            
            switch (opcion) {
                case 1: crearPeliculas();
                        break;
                case 2: mostrarPeliculas();
                        break;
                case 3: mostrarPeliculasMas1Hora();
                        break;
                case 4: ordenarPorDuracionDesc();
                        break;
                case 5: ordenarPorDuracionAsce();
                        break;
                case 6: ordenarPorTituloAlfa();
                        break;
                case 7: ordenarPorDirectorAlfa();
                        break;
                case 8: System.out.println("Salir");
                        break;
                default: System.out.println("Opcion no Válida");
            }
            
        } while (opcion != 8);
    }
}
