package operadoreslogicos;

/**
 *Determina si una cadena de texto contiene la letra "a" y la letra "b"
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        try{ 
            System.out.print("Ingrese un texto: ");
            String cadena = sc.nextLine();
            
            boolean a = cadena.contains("a") || cadena.contains("á");
            System.out.println("El texto contiene \"a\": " + a);
            
            boolean b = cadena.contains("b");
            System.out.println("El texto contiene \"b\": " + b);
            
            boolean c = (cadena.contains("a") || cadena.contains("á")) && cadena.contains("b");
            System.out.println("El resultado es: " + c);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
    }
}
