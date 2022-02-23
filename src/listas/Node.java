/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author javie_c2zwkpq
 */
public class Node {
    //public String correlativo; 
    public String codigo;
    public String producto;
    public int existencia;
    public Node next;//puntero 
    
    public Node(String codigo, String producto, int existencia){
      //  this.correlativo = correlativo;
        this.codigo = codigo;
        this.producto = producto;
        this.existencia = existencia;
        this.next = null;
      
    }
    
    
    
}
