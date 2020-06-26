/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleccion;

/**
 *
 * @author ASUS
 */
public class seleccion {
    
     public static void main(String[] args){
     
    int[] array = {7,8,2,4,0,1,6,3,8,4,3,7,3};
    
    ordenamientoSeleccion ordenar = new ordenamientoSeleccion();
    
    ordenar.ordenamientoSeleccion(array);
    ordenar.imprime(array);
}
}