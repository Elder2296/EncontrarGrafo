/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recorridoeuleriano;

/**
 *
 * @author elari
 */
public class Vertice {
    private String nombre;
    private int grado;
    public Vertice(String nombre,int grado){
        this.nombre=nombre;
        this.grado=grado;
    }
    public Vertice(){
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGrado() {
        return grado;
    }

    public void setGrado(int grado) {
        this.grado = grado;
    }
    
    
}
