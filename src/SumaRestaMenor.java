import java.util.Scanner;

public class SumaRestaMenor {

public static void main (String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingresa un número A: ");
    double A = scanner.nextDouble();
    System.out.println("Ingresa un número B: ");
    double B = scanner.nextDouble();

    if (A == B) {
        double igual = A = B;
        System.out.println("La respuesta es: " + igual);
    } else if (A < B) {
        double suma = A + B;
        System.out.println("La respuesta es: " + suma);

    } else {
        double resta = A - B;
    System.out.println("La respuesta es: " + resta);
}

scanner.close();
}
}