package ejerciciosjava;

/**
 *Generar una secuencia de Fibonacci
 * @author nemg
 * Secuencia infinita de números naturales, a partir del 0 y el 1.
 * Se van sumando de manera que cada número es igual a la suma de sus dos anteriores:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55…
 */
import java.util.Scanner;

public class Secuencia {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.println("¿Cuántos números quieres generar? ");
            int cantidad = sc.nextInt();

            long num1 = 0;
            long num2 = 1;
            long i = 0;

            if (cantidad <= 90){ //números mayores a 90 dan negativo
                System.out.println("Secuencia de Fibonacci: ");
                while (i < cantidad) {

                    System.out.print(num1 + " ");

                    long num3 = num2 + num1;
                    num1 = num2;
                    num2 = num3;
                    i += 1;
                    }
            } else {
                System.out.println("El número es demasiado largo.");
            }

            /*long valori = 0;
            long valorf = 1;
            long aumento = 0;

            if (cantidad <= 90){
                for(long i=0; i<cantidad; i++){
                    valori = aumento;
                    aumento = aumento + valorf;
                    valorf = valori;
                    System.out.println(valorf);
                }
            } else {
                System.out.println("El número es demasiado largo.");
            }*/
            
        } catch (Exception err) {
            System.out.println("ERROR: No es un número entero");
        } finally {
            sc.close();
        }
                    
    }
}
