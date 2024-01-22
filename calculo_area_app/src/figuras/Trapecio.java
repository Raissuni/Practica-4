package figuras;

import java.util.Scanner;

public class Trapecio {
    private static Scanner scanner = new Scanner(System.in);

    public static void calculateArea() {
        System.out.println("Cálculo del Área de un Trapecio");
        System.out.print("Ingrese la longitud de la base mayor (b): ");
        double baseMayor = scanner.nextDouble();

        System.out.print("Ingrese la longitud de la base menor (a): ");
        double baseMenor = scanner.nextDouble();

        System.out.print("Ingrese la altura (h): ");
        double altura = scanner.nextDouble();

        double area = ((baseMayor + baseMenor) * altura) / 2;

        System.out.println("El área del trapecio es: " + area);
        
    }
    public static void cerrarScanner(){
        scanner.close();
    }
}