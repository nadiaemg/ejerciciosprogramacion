package operadoreslogicos;

import java.util.Scanner;

/**
 *Verifica si un estudiante ha aprobado si su nota es mayor o igual a 70 o si ha
obtenido un resultado de "Aprobado" en su evaluación
 * @author nemg
 */

public class Ejercicio14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in, "ISO-8859-1");
        
        try{
            System.out.println("¿Tiene registrada la calificación? (Si/No): ");
            String registro = sc.nextLine();
            String registroMin = registro.toLowerCase();
            
            if(registroMin.contains("si") || registroMin.contains("sí")){
                System.out.println("Ingrese calificación: ");
                int calificacion = sc.nextInt();
                if(calificacion >= 70) {
                    System.out.println("El estudiante ha aprobado.");
                } else {
                    System.out.println("El estudiante no ha aprobado.");
                }
            } else {
                System.out.println("¿El estudiante obtuvo 'Aprobado' en la evaluación? (Si/No): ");
                String resultado = sc.nextLine();
                String resultadoMin = resultado.toLowerCase();
                if(resultadoMin.contains("si") || resultadoMin.contains("sí") || resultadoMin.contains("aprobado")){
                    System.out.println("El estudiante ha aprobado.");
                } else {
                    System.out.println("El estudiante no ha aprobado.");
                }
            }

        } catch (Exception err) {
            System.out.println("ERROR: Los datos introducidos no son válidos");
        } finally {
            sc.close();
        }
        
    }
}
