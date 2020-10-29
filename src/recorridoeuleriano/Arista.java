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
public class Arista {
    private Vertice inicio;
    private Vertice fin;
    public Arista(){
        this.inicio=new Vertice();
        this.fin=new Vertice();
        
    }
    public void setInicio(Vertice vertice){
        this.inicio=vertice;
    }
    public void setFinal(Vertice vertice){
        this.fin=vertice;
    }

    public Vertice getInicio() {
        return inicio;
    }

    public Vertice getFin() {
        return fin;
    }
    
    
}
