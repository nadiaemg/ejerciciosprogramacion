/**
 *Encuentra el máximo común divisor de dos números
 * @author nemg
 * MCD - mayor número que divide exactamente a dos o más números a la vez
 */
import java.util.Scanner;

public class Maxcomdiv {
    public static int mcd(int a, int b) {
        
        /*if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }*/
        
        if (a==0 || b==0){
            return 0;
        }
        if (a==b){
            return a;
        }
        if (a>b){
            return mcd(a-b, b);
        } else {
            return mcd(a, b-a);
        }
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{    

            System.out.println("Introduce el primer número: ");
            int num1 = sc.nextInt();
            System.out.println("Introduce el segundo número: ");
            int num2 = sc.nextInt();

            int mcdiv = mcd(num1, num2);

            System.out.println("El máximo común divisor es: " + mcdiv);
        } catch (Exception err) {
            System.out.println("ERROR: Los datos ingresados no son válidos");
        } finally {
            sc.close();
        }
    }
}
