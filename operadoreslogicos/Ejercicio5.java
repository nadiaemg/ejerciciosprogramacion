package operadoreslogicos;
/**
 *Verifica si un número es par o si es múltiplo de 5.
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.print("Ingrese un número entero: ");
            long numero = sc.nextLong();
            
            boolean a = (numero %2 ==0);
            System.out.println("¿El resultado es par? " + a);
            
            boolean b = (numero %5 ==0);
            System.out.println("¿El resultado es múltiplo de 5? " + b);
            
            boolean resultado = (numero %2 ==0) || (numero %5 ==0);
            System.out.println("El resultado es par o múltiplo de 5: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
    }
}
