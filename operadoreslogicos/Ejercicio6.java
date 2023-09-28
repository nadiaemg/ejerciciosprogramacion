package operadoreslogicos;

/**
 *Determina si un estudiante ha aprobado: su nota es mayor o igual a 60 y menor o igual a 100
 * @author nemg
 */
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        try{ 
            System.out.print("Ingrese una calificación entre 0 y 100: ");
            int calificacion = sc.nextInt();
            
            boolean aprobacion = (calificacion > 60) && (calificacion <= 100);
            
            if (calificacion >= 0 && calificacion <= 100){
                System.out.println("Estudiante aprobado: " + aprobacion);
            } else {
                System.out.println("La calificación debe ser un número entero entre 0 y 100");
            }
                
        } catch (Exception err) {
            System.out.println("ERROR: El dato ingresado no es una calificación válida");
        } finally {
            sc.close();
        }
    }
}
