// Verificar si un número es par o impar.

// Numeros pares: 2,4,6,8
// Numeros impares: 1, 3, 5, 7

import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println(numero + " es un numero par");
            } else {
                System.out.println(numero + " es un número impar");
            }

        } catch (Exception err) {
            System.out.println("Hubo un error ");
        } finally {
            scanner.close();
        }

    }
}