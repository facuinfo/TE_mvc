package com.emergentes.modelo;

/**
 *
 * @author facu_
 */
public class Encuesta {
   private String nombre;
   private String[] lenguaje;
   
   public String[] getLenguaje(){
       return lenguaje;
   }
   public void setLenguaje(String[] lenguaje){
       this.lenguaje=lenguaje;
   }
   public String getNombre(){
       return nombre;
   }
   public void setNombre(String nombre){
       this.nombre=nombre;
   }
}
