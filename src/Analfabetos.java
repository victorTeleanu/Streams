import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Analfabetos {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("Archivos/illiterate.csv"));
        String linea;
        ArrayList<Member> personasAnalfabetas = new ArrayList<>();
        reader.readLine();
        while ((linea = reader.readLine()) != null) {
            String[] actual = linea.split(",");
            String pais = actual[5];
            int cantidad = Integer.parseInt(actual[8]);
            personasAnalfabetas.add(new Member(pais, cantidad));
        }
        personasAnalfabetas.stream().sorted().forEach(System.out::println);
    }
}
