package operadoreslogicos;

/**
 *Verifica si un número es divisible por 2 y por 3
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Verifique si un número es divisible entre 2 y 3");
        
        try{ 
            System.out.print("Ingrese el número entero: ");
            int numero = sc.nextInt();
            
            boolean resultado = (numero %2 ==0) && (numero %3 ==0);
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
    }
}
