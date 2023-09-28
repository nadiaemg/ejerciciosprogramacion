package operadoreslogicos;

/**
 *Verifica si un número es menor que 50 o mayor que 100.
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Verifique si un número es menor que 50 o mayor que 100");
        
        try{ 
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            
            boolean resultado = (numero < 50) || (numero > 100);
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
    }
}
