package operadoreslogicos;
import java.util.Scanner;
/**
 *Verifica si un número es primo y menor que 100.
 * Un número primo sólo puede dividirse entre si mismo y 1
 * @author nemg
 */


public class Ejercicio11 {
    
    public static boolean numPrimo(int n){

        if(n <= 1){ //tiene que ser positivo diferente de cero
            return false;
        }
        else if(n == 2){ //2 es el unico par primo
            return true;
        } else{
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            } return true;
        }     
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.print("Ingrese un número entero: ");
            int numero = sc.nextInt();
            
            boolean a = numero < 100;
            System.out.println("El número es menor que 100: " + a);
            
            boolean b = numPrimo(numero);
            System.out.println("El número es primo: " + b);
            
            boolean resultado = numero < 100 && numPrimo(numero);
            System.out.println("El resultado es: " + resultado);
            
        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
