package ejerciciosjava;

/**
 *Verificar si un año es bisiesto o no
 * @author nemg
 */
import java.util.Scanner;

public class Bisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Ingresa un año: ");
            int year = sc.nextInt();

            if (year < -46){
                System.out.println("Todavía no existían los años bisiestos, hasta 46 a.C.");
            } else if (year%400==0 && year%100==0){
                System.out.println(year + " es año bisiesto");
            } else if (year%100==0){
                System.out.println(year + " no es año bisiesto");
            } else if (year % 4 == 0) {
                System.out.println(year + " es año bisiesto");
            } else {
                System.out.println(year + " no es año bisiesto");
            }    

        } catch (Exception err) {
            System.out.println("Error Terrible: El dato ingresado no corresponde a un año");
        } finally {
            sc.close();
        }

    }
}
