/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import static recursividad.Recursividad.MCD;

/**
 *
 * @author Usuario
 */
public class Test {

    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
         int [] vector ={1,8,6};
         int [] vectorbinario ={1,0,1,1,0,1};
         
//        Recursividad.invest(vector, 0, vector.length-1);
//        for (int i : vector) {
//            System.out.println(i);  
//     }
     // System.out.println(""+Recursividad.Returnvec(vector));
     int total = 46725;
        System.out.println(Recursividad.obtenerDeposito(total,""));
     
     //System.out.println(""+ MCD(46225, 20000));
       // System.out.println(""+Recursividad.binaryToDecimal(vectorbinario, 0));
    }
    
}
