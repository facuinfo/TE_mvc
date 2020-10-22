/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
