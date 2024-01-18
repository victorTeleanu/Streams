public class Buenos implements Comparable<Buenos> {
    private int comportamiento;
    private int pesoRegalo;

    public Buenos(int comportamiento, int pesoRegalo) {
        this.comportamiento = comportamiento;
        this.pesoRegalo = pesoRegalo;
    }

    public int getComportamiento() {
        return this.comportamiento;
    }

    public int getPesoRegalo() {
        return this.pesoRegalo;
    }

    public String toString() {
        return this.getComportamiento() + " " + this.getPesoRegalo() + " ";
    }

    @Override
    public int compareTo(Buenos other) {
        if (this.comportamiento == other.comportamiento) {
            return this.pesoRegalo - other.pesoRegalo;
        } else {
            return other.comportamiento - this.comportamiento;
        }
    }
}
