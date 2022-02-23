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
public class LinkList {
    
  
    
    
    
    public Node cabeza = null;
    public int longitud = 0;
    

    
    public void insertarPrincipio(String codigo, String producto, int exitencia){
        Node nodo = new Node(codigo, producto, exitencia);
        nodo.next = cabeza;
        cabeza = nodo;
        longitud++;

    }
    
    public void insertarFinal(String codigo, String producto, int exitencia){
        Node nodo = new Node(codigo, producto, exitencia);
        if(cabeza== null){
           cabeza= nodo;
           
        }else{
        Node puntero = cabeza;
        while(puntero.next != null){
            puntero = puntero.next; 
        }
        puntero.next = nodo;
        }
        longitud++;
      
    }
    
    public void insertarDespues(String codigo, String producto, int exitencia, int n){
        Node nodo = new Node(codigo, producto, exitencia);
        if(cabeza== null){
           cabeza= nodo;
           longitud++;
        }else{
            Node puntero = cabeza;
            int contador =0;
            while(contador < n && puntero.next != null){
                puntero = puntero.next;
                contador++;
            }
            nodo.next = puntero.next; 
            puntero.next = nodo; 
            longitud++;
            
        }
        
    }
    
    public int contar(){
        return longitud;
        
    }
    
    public boolean estaVacia(){
        return cabeza == null; 
    }
    
    
    public void eliminarPrincipio(){
        if(cabeza!= null){
        
        Node primero = cabeza;
        cabeza = cabeza.next;
        primero.next = null;
        longitud--;
        }
    }

    public void eliminarUltimo(){
        if(cabeza != null){
            if(cabeza.next == null){
                cabeza = null;
            }else{
            Node puntero = cabeza;
            while(puntero.next.next !=null){
                puntero = puntero.next;
            }
            puntero.next = null;
            longitud--;
            }
        }
        }
    
    public void eliminarDespues(int n){
        if(cabeza != null){
            if(n==0){
                   Node primero = cabeza;
                    cabeza = cabeza.next;
                    primero.next = null;
                    longitud--;
            }else if(n<longitud){
            Node puntero = cabeza;
            int contador = 0;
           while(contador < (n-1)){
               puntero = puntero.next;
               contador++;
           } 
           Node temp = puntero.next;
           puntero.next = temp.next;
           temp.next = null;
           longitud--;
            }
        }
    }
    
    
    public void imprimir(){
        Node temp= this.cabeza;
        System.out.println("\n\n\n--------------------------------------\n");
        System.out.println("Corre  -  Codigo   -   Producto   -   Cantidad\n");
        int corre = longitud;
        while(temp!= null){
            corre=longitud+1;
            System.out.println(  "  " + String.valueOf(temp.existencia+1)  + ".  -  " +  temp.codigo +"   -   "+  temp.producto +"   -   "+ temp.existencia+"\n");
            
            temp= temp.next;
            
        }
        
    }
    
}

