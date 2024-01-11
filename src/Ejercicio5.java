import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introdúce cadenas (espacio en blanco para acabar):");
        int num;
        while (miScanner.hasNextInt()) {
            num = miScanner.nextInt();
            numeros.add(num);
            if (num < 0) {
                break;
            }
        }

        numeros.stream()
                .filter(n -> n>1 && n<5)
                .forEach(System.out::println);

    }

}
