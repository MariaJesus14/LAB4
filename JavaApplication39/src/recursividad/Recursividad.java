/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author Roibin Elizondo
 * @author Maria
 */
public class Recursividad {

    public static void main(String[] args) {
        int[] vectorBinario1 = {1, 0, 1, 1, 0, 1};
        int[] vectorBinario2 = {1, 1, 1, 1, 0};
        int[] vector1 = {1, 2, 3, 4, 5};
        int[] vector2 = {10, 20, 30};

        //1 Binario a decimal
        System.out.println("\nBinario a decimal\n" + Recursividad.binaryToDecimal(vectorBinario1, vectorBinario1.length - 1) + "\n\ninvertir arreglo");
        //System.out.println(""+Recursividad.binaryToDecimal(vectorBinario2, vectorBinario2.length-1));

        //2 invertir arreglo
        Recursividad.invest(vector1, 0, vector1.length - 1);
        for (int i : vector1) {
            System.out.println(i);
        }

        //3 Retorno string del contenido de un vector con espacios
        System.out.println("\nRetorno string del contenido de un vector con espacios\n" + Recursividad.returnvec(vector1, 0));
        //System.out.println("\nRetorno string del contenido de un vector con espacios\n" + Recursividad.returnvec(vector2, 0));

        //4 Retiro de ATM
        System.out.println("\nRetiro de ATM\n" + Recursividad.getDeposit(46725, ""));
        System.out.println("\nRetiro de ATM\n" + Recursividad.getDeposit(27000, ""));

        //5 Maximo comun divisor
        System.out.println("\nMaximo comun divisor\n" + MCD(46225, 20000));
        System.out.println("\nMaximo comun divisor\n" + MCD(10, 5));

    }

    //1) Realice un método que transforme un número expresado en notación binaria a un número
//expresado en notación decimal. Recibe el número binario y retorna el número decimal. No puede
//hacer uso de String ni similares.
    final static int[] array = {50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 25, 10, 5};
    private static int decimalValue = 0;

    public static int binaryToDecimal(int[] vector, int index) {
        if (index >= 0) {
            if (vector[index] == 1) {
                decimalValue = (int) (decimalValue + (Math.pow(2, ((vector.length - 1) - index))));
                binaryToDecimal(vector, index - 1);
            } else {
                binaryToDecimal(vector, index - 1);
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
//3) Realice un método que retorne una hilera de texto con el contenido de un vector recibido, cada
//elemento separado por un espacio. Este método le servirá para la prueba del método anterior (5 pts)
    static String txt = "";

    static String returnvec(int[] vector, int index) {
        if (index == vector.length - 1) {
            return txt += " " + vector[index];
        } else {
            txt += " " + vector[index];
            return returnvec(vector, index + 1);
        }
    }
//    4) Realice un método que simule el funcionamiento de un cajero automático para dispensar el
//dinero solicitado en un retiro bancario, según el sistema monetario de nuestro país. Deberá crear un
//método que reciba el monto del que se quiere dispensar el dinero. Se deberá realizar el cálculo de la
//cantidad a dispensar de cada denominación, para esto además del monto se deberá manejar un vector
//con las denominaciones 50000, 20000, 10000, 5000, 2000, 1000, 500, 100, 50, 25, 10, 5.
//El método debe buscar el número mínimo de billetes y monedas para dar el dinero y retornar una
//hilera con la cantidad de billetes y monedas por cada denominación, separadas por cambio de línea.
//En el algoritmo del cálculo no podrá utilizar la operación de división por lo que deberá realizar restas
//de los montos según sea necesario, tampoco podrá usar cantidades fijas para los montos ni las
//posiciones del vector, de tal forma que si el vector cambia de contenido o de tamaño, el método
//recursivo no debe ser modificado.

    public static String getDeposit(int money, String text) {
        if (money <= 0) {
            return text;
        }
        int rest = atm(money);
        text += rest + "\n";
        money -= rest;
        return getDeposit(money, text);
    }

    private static int atm(int retirement) {

        for (int ticket : array) {
            if (retirement - ticket >= 0) {
                return ticket;
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
