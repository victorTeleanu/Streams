import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner miScanner = new Scanner(System.in);
        System.out.println("Introdúce cadenas (espacio en blanco para acabar):");
        String cadena;
        while (miScanner.hasNextLine()) {
            cadena = miScanner.nextLine();
            cadenas.add(cadena);
            if (cadena.isBlank()) {
                break;
            }
        }

        cadenas
                .forEach(System.out::println);
    }

}
