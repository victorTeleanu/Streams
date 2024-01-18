import java.util.ArrayList;
import java.util.List;

public class Tutankamon {
    public static void main(String[] args) {
        List<ObjetosTutankamon> objetos = new ArrayList<>();
        objetos.add(new ObjetosTutankamon("flecha", 5, 1));
        objetos.add(new ObjetosTutankamon("sandalias", 10, 2));
        objetos.add(new ObjetosTutankamon("sarcofago", 1000, 1000));
        objetos.add(new ObjetosTutankamon("mascara", 1000, 10));
        objetos.add(new ObjetosTutankamon("arco", 10, 2));

        objetos.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
