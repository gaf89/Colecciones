/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
*/
public class AlumnoServicio {
    
    Scanner leer = new Scanner(System.in);
    ArrayList<Alumno> alumnos = new ArrayList();
        
    public void crearAlumnos() {
        String resp, nombre;
               
        do {
            ArrayList notas = new ArrayList();
            System.out.println("Ingrese el nombre del alumno");
            nombre = leer.next();
            
            System.out.println("Ingresar Notas");
            System.out.print("Nota 1: ");
            notas.add(leer.nextInt());
            System.out.print("Nota 2: ");
            notas.add(leer.nextInt());
            System.out.print("Nota 3: ");
            notas.add(leer.nextInt());
            
            Alumno alum = new Alumno(nombre, notas);
            
            alumnos.add(alum);
            
            System.out.println("¿Quiere crear otro alumno?(si/no)");
            resp = leer.next();
            
        } while (resp.equals("si"));
        
    }
        
        
/*
        Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
        */
        
    public void notaFinal() {

        double promedio;
        double suma = 0;
        int cont = 0;
      
        System.out.println("Ingresar el nombre del alumno que quire calcular su nota final:");
        String nombre = leer.next();

        for (Alumno aux : alumnos) {

            if (aux.getNombre().equals(nombre)) {
                
                for (Integer nota : aux.getNotas()) {
                    suma += nota;
                    cont++;
                    System.out.println(nota);
                }
            }
        }
               
        promedio = suma / 3;

        if (cont > 0){
            System.out.println("El promedio del alumno es "+promedio);
        } else {
            System.out.println("Alumno no encontrado");
        }

    }
               
 
    
}
