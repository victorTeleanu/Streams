
public class ObjetosTutankamon implements Comparable<ObjetosTutankamon> {
    private String nombre;
    private int valor;
    private int peso;

    public ObjetosTutankamon(String nombre, int valor, int peso) {
        this.nombre = nombre;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getValor() {
        return this.valor;
    }

    public int getPeso() {
        return this.peso;
    }

    public String toString() {
        return this.getNombre();
    }

    public int compareTo(ObjetosTutankamon other) {
        if (this.valor == other.valor) {
            return this.peso - other.peso;
        } else {
            return other.valor - this.valor;
        }
    }
}


