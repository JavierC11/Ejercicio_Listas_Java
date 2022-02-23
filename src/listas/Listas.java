/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;
//import java.io#;
import java.util.List;


/**
 *
 * @author javie_c2zwkpq
 */
public class Listas {    
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
    /*LinkList Milista2 = new LinkList();
    */
    int numcode = 80;
    
    LinkList Mylist = new LinkList();
    
    for(int i=0; i<=17; i++){
        
        Mylist.insertarPrincipio("SD-"+String.valueOf(numcode)+"X", "Producto"+i , i);
        numcode = numcode + 1;
        
    } 
    
    Mylist.imprimir();
    
    
    ///Intrucciones para agregar al inicio  
    Mylist.insertarPrincipio("SD-1000XF", "Producto 1000F", 1000);
    Mylist.imprimir();
    
    
    ///Intrucciones para agregar al Medio
    Mylist.insertarDespues("SD-1000XM", "Producto 1000M", 1000, 10);
    Mylist.imprimir();
    
    
    ///Intrucciones para agregar al Final
    Mylist.insertarFinal("SD-1000XF", "Producto 1000F", 1000);
    Mylist.imprimir();
    
    
    ///Intrucciones para borrar principio
    Mylist.eliminarPrincipio();
    Mylist.imprimir();
    
    
    ///Intrucciones para borrar al Medio
    Mylist.eliminarDespues(10);
    Mylist.imprimir();
    
    
    ///Intrucciones para borrar al Final
    Mylist.eliminarUltimo();
    Mylist.imprimir();
    
    
    
    
    
    
    
    
    
    
    
       /* Mylist.insertarPrincipio("1", "p1", 1);
        Mylist.insertarPrincipio("2", "p2", 2);
        /*
        System.out.println(Mylist.insertarFinal(3, "p3", 3));
        System.out.println(Mylist.insertarDespues(2, "p2", 2, 1));
        */
       
    /*   
        Mylist.imprimir();
        System.out.println(Mylist.longitud);
        
        
        Mylist.imprimir();
        
      */ 
}

    
}
