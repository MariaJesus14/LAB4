
package recursividad;

/**
 *
 * @author usuario
 */
public class Recursividad {

    public static void main(String[] args) {
        
        System.out.println(""+Recursividad.sumatoria(5));
        System.out.println(""+Recursividad.divRes(10, 2));
        System.out.println(""+Recursividad.Fibonacci(0, 1, 21));
        System.out.println(""+Recursividad.Decimal_Binario(10));
        System.out.println(""+Recursividad.Suma_Digitos(123));
    }
    
    public static int sumatoria (int n){
        if (n<=1) {
            return 1;
        }else {
            return n + sumatoria(n-1);
        }
    }
    
    public static int divRes (int n1,int n2){
        int count;
        if (n1<=n2) {
            return 1;
        }else {
            
            count = n1-n2;
            
            return 1 + divRes(count, n2);
        }
    }
    
    public static String Fibonacci (int n1,int n2, int fin){
        int aux;
        if (n1+n2 ==fin) {
            return ""+ fin;     
        }else {
            aux=n1+n2;
            return  aux+"," + Fibonacci(n2,(n1+n2), fin);
        }
        
    }
    public static String Decimal_Binario (int n){
       
        if (n<1) {
            return "";
        }else {

            return ""+Decimal_Binario(n/2)+(n%2);
        }
        
    }
    public static int Suma_Digitos (int n){
        int aux;
        if (n<1) {
            return 0;
        }else {
            aux=n/10;
            return Suma_Digitos(aux)+ n%10;
        }
    }

    
    
}
