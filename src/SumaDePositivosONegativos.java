import java.util.ArrayList;
import java.util.List;

public class SumaDePositivosONegativos {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(-12);
        numeros.add(6);
        numeros.add(-3);
        numeros.add(9);
        numeros.add(-8);
        numeros.add(-19);
        numeros.add(-2);

        long pos = numeros.stream()
                .filter(numero -> numero > 0)
                .count();
        long neg = numeros.stream()
                .filter(numero -> numero < 0)
                .count();

        System.out.println("La suma de los números positivos es: " + pos);
        System.out.println("La suma de los números negativos es: " + neg);
    }

}
