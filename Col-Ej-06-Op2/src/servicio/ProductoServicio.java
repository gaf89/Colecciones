/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Gaston
 */
public class ProductoServicio {
    
    private Scanner leer;
    private HashMap<String, Producto> productos;
    
    public ProductoServicio() {
         this.leer = new Scanner(System.in).useDelimiter("\n");
         this.productos = new HashMap();
    }
    
    public void introducirElemento() {
        leer.skip("\n");
        System.out.println("Ingresar nombre del Producto");
        String nombre = leer.nextLine();
        
        System.out.println("Ingresar precio del Producto");
        Double precio = leer.nextDouble();
        
        productos.put(nombre, new Producto(nombre, precio));        
    }
    
    public void modificarPrecio() {
        leer.skip("\n");
        System.out.println("Ingresar nombre del Producto que desea cambiar el precio");
        String nombre = leer.nextLine();
        System.out.println("Ingresar nuevo precio para el Producto");
        Double precio = leer.nextDouble();
                
        for (Map.Entry<String, Producto> entry : productos.entrySet()) {
            String key = entry.getKey();
            Producto value = entry.getValue();
            
            if(entry.getKey().equals(nombre)) {
                productos.replace(nombre, new Producto(nombre, precio));
                System.out.println("El precio ha sido modificado");
            }
        }
    }
    
    public void eliminarProducto() {
        leer.skip("\n");
        System.out.println("Ingresar nombre del Producto que desea eliminar");
        String nombre = leer.nextLine();
                
        for (Map.Entry<String, Producto> aux : productos.entrySet()) {
            String key = aux.getKey();
            Producto value = aux.getValue();
            
            if (aux.getKey().equals(nombre)) {
                productos.remove(key);
                System.out.println("El producto ha sido eliminado");
            }
        }
    }
    
    public void mostrarProductos() {
        
        System.out.println("*************************************");
        
        for (Map.Entry<String, Producto> aux : productos.entrySet()) {
            String key = aux.getKey();
            Producto value = aux.getValue();
            
            System.out.println("Producto: "+key+"  Precio: $"+value.getPrecio());
        }
        System.out.println("*************************************");
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
