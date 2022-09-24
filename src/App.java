import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("insert a number");
        int numeroIf = scanner.nextInt();
        if (numeroIf > 0) {
            System.out.println("the number is positive");
        } else if (numeroIf < 0) {
            System.out.println("the number is negative");
        } else {
            System.out.println("the number is 0");
        }

        System.out.println("insert a number to while");
        int numeroWhile = scanner.nextInt();
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("numeroWhile is: " + numeroWhile);
        }

        do {
            numeroWhile++;
            System.out.println("numeroWhile in doWhile is: " + numeroWhile);
        } while (numeroWhile < 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println("the value of numeroFor is: " + numeroFor);
        }

        System.out.println("inserte una estacion del año: VERANO-OTOÑO-INVIERNO-PRIMAVERA");
        String estacion = scanner.next();
        switch (estacion) {
            case "VERANO":
                System.out.println("estamos en verano");
                break;
            case "OTOÑO":
                System.out.println("estamos en otoño");
                break;
            case "INVIERNO":
                System.out.println("estamos en invierno");
                break;
            case "PRIMAVERA":
                System.out.println("estamos en primavera");
                break;
            default:
                System.out.println("no se ingreso un nombre de estacion valido");
                break;
        }
    }
}
