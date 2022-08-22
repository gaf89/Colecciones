/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
/*
Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.
*/
public class ProductosServicio {
    
    Scanner leer = new Scanner(System.in);
    
    HashMap<String, Double> productos = new HashMap();
    
    public void introducirElemento() {
        
        System.out.println("Ingresar nombre del Producto");
        String nombre = leer.next();
        System.out.println("Ingresar precio del Producto");
        Double precio = leer.nextDouble();
        
        productos.put(nombre, precio);
        
    }
    
    public void modificarPrecio() {
        
        System.out.println("Ingresar nombre del Producto que desea cambiar el precio");
        String nombre = leer.next();
        System.out.println("Ingresar nuevo precio para el Producto");
        Double precio = leer.nextDouble();
        
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            if (aux.getKey().equals(nombre)) {
                productos.replace(nombre, precio);
                System.out.println("El precio ha sido modificado");
            }
        }
    }
    
    public void eliminarProducto() {
        
        System.out.println("Ingresar nombre del Producto que desea eliminar");
        String nombre = leer.next();
                
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            if (aux.getKey().equals(nombre)) {
                productos.remove(nombre);
                System.out.println("El precio ha sido eliminado");
            }
        }
    }
    
    public void mostrarProductos() {
        
        for (Map.Entry<String, Double> aux : productos.entrySet()) {
            String key = aux.getKey();
            Double value = aux.getValue();
            
            System.out.println("Producto: "+key+"  Precio: $"+value);
        }
    }
    
    public int menu() {
        
        System.out.println("--------------------------------------");
        System.out.println("MENÚ");
        System.out.println("");
        System.out.println("1. Agreagar Producto");
        System.out.println("2. Modificar Precio del Producto");
        System.out.println("3. Eliminar Producto");
        System.out.println("4. Mostrar Productos");
        System.out.println("5. Salir");
        System.out.println("--------------------------------------");
        System.out.print("Introducir Opcion: ");
        int opcion = leer.nextInt();
        
        switch (opcion) {
            case 1: introducirElemento();
                    break;
            case 2: modificarPrecio();
                    break;
            case 3: eliminarProducto();
                    break;
            case 4: mostrarProductos();
                    break;
            case 5: System.out.println("Salir");
                    break;
            default: System.out.println("Opcion no válida");
                    break;
        }
        
        return opcion;
    }
}
