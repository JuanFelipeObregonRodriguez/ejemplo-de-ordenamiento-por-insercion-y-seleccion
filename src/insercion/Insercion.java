/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insercion;

/**
 *
 * @author ASUS
 */
public class Insercion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int[] array = {1,2,7,3,9,7,2,5,3,2};
      
      ordenamiento o = new ordenamiento();
      o.insercion(array);
      
      for(int i=0; i< array.length; i++){
      
      System.out.println(array[i]);
              
      
      }
    }
    
    
}
