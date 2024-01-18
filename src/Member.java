
public class Member implements Comparable<Member> {
    private String pais;
    private int cantidad;

    public Member(String pais, int cantidad) {
        this.pais = pais;
        this.cantidad = cantidad;
    }

    public String getPais() {
        return this.pais;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public String toString() {
        return this.getPais() + " (" + this.getCantidad() + ")";
    }

    public int compareTo(Member member) {
        if (this.cantidad == member.getCantidad()) {
            return 0;
        } else if (this.cantidad > member.getCantidad()) {
            return 1;
        } else {
            return -1;
        }
    }
}


