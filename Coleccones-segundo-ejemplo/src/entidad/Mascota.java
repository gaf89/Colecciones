/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Objects;

/**
 *
 * @author Gaston
 */
public class Mascota implements Comparable<Mascota>{
    
    public String nombre;
    public String apodo;
    public String tipo;
    public String color;
    public Integer edad;
    public boolean cola;
    public String raza;
    private Integer energia;
    
    public Mascota() {
        this.energia = 1000;
    }

    public Mascota(String nombre, String apodo, String tipo) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }

   
    
    public Mascota(String nombre, String apodo, String tipo, String color, Integer edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        this.energia = 1000;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public Integer getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public Integer pasear(Integer energiaRestar) {
        
        //energia = energia - energiaRestar;
        energia -= energiaRestar;
        
        return energia;
    }
    
     public Integer pasear(Integer energiaRestar, Integer vueltas) {
        
         for (Integer i = 0; i < vueltas; i++) {
             energia -= energiaRestar;
         }
        
        return energia;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombre);
        hash = 89 * hash + Objects.hashCode(this.apodo);
        hash = 89 * hash + Objects.hashCode(this.tipo);
        hash = 89 * hash + Objects.hashCode(this.color);
        hash = 89 * hash + Objects.hashCode(this.edad);
        hash = 89 * hash + (this.cola ? 1 : 0);
        hash = 89 * hash + Objects.hashCode(this.raza);
        hash = 89 * hash + Objects.hashCode(this.energia);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mascota other = (Mascota) obj;
        if (this.cola != other.cola) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apodo, other.apodo)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.color, other.color)) {
            return false;
        }
        if (!Objects.equals(this.raza, other.raza)) {
            return false;
        }
        if (!Objects.equals(this.edad, other.edad)) {
            return false;
        }
        if (!Objects.equals(this.energia, other.energia)) {
            return false;
        }
        return true;
    }
     
     
     
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }

    @Override
    public int compareTo(Mascota t) {
        return t.getNombre().compareTo(this.nombre);
    }
    
    
    
    
}
