import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NinosBuenos {
    public static void main(String[] args) {
        List<Buenos> comportamientoNinos = new ArrayList<>();
        comportamientoNinos.add(new Buenos(80, 2));
        comportamientoNinos.add(new Buenos(100, 12));
        comportamientoNinos.add(new Buenos(100, 1));
        comportamientoNinos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}

