import java.util.ArrayList;
import java.util.List;

public class LaJusticiaDeLaLoteria {
    public static void main(String[] args) {
        List<Loteria> premios = new ArrayList<>();
        premios.add(new Loteria(9, 4));
        premios.add(new Loteria(10, 6));
        premios.add(new Loteria(9, 5));
        premios.add(new Loteria(1, 3));
        System.out.println(esJusto(premios));

        premios = new ArrayList<>();
        premios.add(new Loteria(10, 5));
        premios.add(new Loteria(20, 5));
        premios.add(new Loteria(30, 5));
        System.out.println(esJusto(premios));
    }
    public static String esJusto (List<Loteria> premios) {
        for (int i = 0; i < premios.size(); i++) {
            if (premios.get(i).getInversion() > premios.get(i + 1).getInversion()) {
                if (premios.get(i).getPremio() < premios.get(i + 1).getPremio()) {
                    return "NO";
                }
            } else if (premios.get(i).getInversion() < premios.get(i + 1).getInversion()) {
                if (premios.get(i).getPremio() >= premios.get(i + 1).getPremio()) {
                    return "NO";
                }
            }
            return "SI";
        }
        return null;
    }
}
