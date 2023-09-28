package operadoreslogicos;

/**
 *Verifica si una cadena de texto contiene la palabra "Java" y no contiene la palabra "Python".
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.println("Ingrese su texto: ");
            String texto = sc.nextLine();
            String cadena = texto.toLowerCase();
            
            boolean a = cadena.contains("java");
            System.out.println("El texto contiene \"Java\": " + a);
            
            boolean b = cadena.contains("python");
            System.out.println("El texto contiene \"Python\": " + b);
            
            boolean resultado = cadena.contains("java") && !cadena.contains("python");
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
    }
}
