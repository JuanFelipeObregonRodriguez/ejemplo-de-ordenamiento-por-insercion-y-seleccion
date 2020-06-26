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
public class ordenamientoSeleccion {

    public void ordenamientoSeleccion(int[] a) {
      int minimo;
        for (int i = 0; i < a.length; i++) {
             minimo= i;
            for (int j = 0; j < a.length; j++) {
                if (a[j] < a[minimo]) {
                    minimo = j;

                }
                int aux = a[i];
                a[i] = a[minimo];
                a[minimo] = aux;
            }

        }
    }
    public void imprime(int a[]){
    
    for(int i=0; i<a.length;i++){
    
    System.out.println(a[i]+"/t");
          
    }
    
    }
}
