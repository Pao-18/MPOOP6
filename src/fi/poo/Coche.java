/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fi.poo;

/**
 *
 * @author poo03alu09
 */
public class Coche {
   private String color;
   private String marca;
   private String placa;
   /**
   *Constructor vacio 
   */
    public Coche(){
    }
   /**
   *
   *@param color colo del coche 
   *@param marca marca del coche
   *@param placa placa vehicular 
   */
    public Coche(String color, String marca, String placa) {
        this.color = color;
        this.marca = marca;
        this.placa = placa;
    }
   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void acelerar(){
        System.out.println("acelerar");
    }
    
    public void frenar(){
        System.out.println("frenar");
    }
    /**
     * metodo que carga cosas
     * @param cosa cantidad de carga
     * @return cosa que cargo el coche
     */
    public String carga(String cosa){
        System.out.println("cargando "+cosa);
       return cosa;
    }
    
    @Override
    public String toString() {
        return "Coche{" + "color=" + color + ", marca=" + marca + ", placa=" + placa + '}';
    }
   
}

