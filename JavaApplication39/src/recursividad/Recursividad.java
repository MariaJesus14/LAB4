/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Usuario
 */
public class Recursividad {
    
 //1) Realice un método que transforme un número expresado en notación binaria a un número
//expresado en notación decimal. Recibe el número binario y retorna el número decimal. No puede
//hacer uso de String ni similares. 
    
    final static int [] array = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 25, 10, 5};
  private static int decimalValue = 0;
  public static int binaryToDecimal( int[] vector, int index ) {
  if(index >= 0) {
    if(vector[index] == 1) {  
      decimalValue = (int) (decimalValue + (Math.pow(2, ( (vector.length-1) - index ))));
      binaryToDecimal(vector, index-1);
    }
       else{
      binaryToDecimal(vector, index-1);
    }
  }
  return decimalValue;
  }
//2) Realice un método que invierta los números de un arreglo de enteros. Recibe el vector a invertir
//y realiza la modificación sobre el mismo vector, por lo que no retorna. No puede crear nuevos
//vectores ni hacer uso de String ni similares.
  
    public static void invest(int[] vector, int star, int fin) {
        if (star > fin) {

        } else {
            int tem = vector[star];
            vector[star] = vector[fin];
            vector[fin] = tem;
            invest(vector, star + 1, fin - 1);
        }
    }
//) Realice un método que retorne una hilera de texto con el contenido de un vector recibido, cada
//elemento separado por un espacio. Este método le servirá para la prueba del método anterior (5 pts)

    public static String Returnvec(int[] vector) {

        return ""+Returnvec(vector,0);
    }
    static String Returnvec (int [] vector, int index){
        if (index >= vector.length) {
            return "";
        } else {

            return vector[index]+" " + Returnvec(vector, index++);
        }
    }
    public static String obtenerDeposito(int dinero, String txt){
        if (dinero <= 0) 
            return txt;
            int resto = atm(dinero);
            txt += resto+"\n";
            dinero-=resto;
            return obtenerDeposito(dinero, txt);
    }
    private static int atm(int r){
        
        for (int billete : array) {
            if (r-billete >= 0) {
                return billete;
            }
        }
        return 0;
        
    }

    //5) Realice un método para calcular el MCD(máximo común divisor) de dos número enteros
//mediante el algoritmo Euclides, el cual consiste en ir restando al número más grande el más pequeño,
//hasta que queden dos números iguales, qué será el MCD de los números. El método deberá recibir los
//números y retornar el MCD resultado. Los números pueden recibirse en cualquier orden. Debe realizar
//el algoritmo mediante restas, no puede hacer uso de operadores de división o residuo. (
    public static int MCD(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        } else {
            if (n1 >= n2) {
                return MCD(n1 - n2, n2);
            } else {
                return MCD(n1, n2 - n1);
            }
        }
    }

   
}
