package operadoreslogicos;

/**
 *Comprueba si un número es negativo o si es cero.
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Compruebe si un número es negativo o si es cero");
        
        try{ 
            System.out.print("Ingrese un número: ");
            double numero = sc.nextDouble();
            
            boolean resultado = (numero <= 0);
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
