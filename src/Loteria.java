
public class Loteria implements Comparable<Loteria> {
    private int inversion;
    private int premio;

    public Loteria(int inversion, int premio) {
        this.inversion = inversion;
        this.premio = premio;
    }

    public int getInversion() {
        return this.inversion;
    }

    public int getPremio() {
        return this.premio;
    }

    public String toString() {
        return this.getInversion() + " (" + this.getPremio() + ")";
    }

    public int compareTo(Loteria other) {
        if (this.inversion == other.inversion) {
            return this.premio - other.premio;
        } else {
            return this.inversion - other.inversion;
        }
    }
}


