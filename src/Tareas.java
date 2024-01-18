
public class Tareas implements Comparable<Tareas> {
    private int prioridad;
    private int duracion;

    public Tareas(int prioridad, int duracion) {
        this.prioridad = prioridad;
        this.duracion = duracion;
    }

    public int getPrioridad() {
        return this.prioridad;
    }

    public int getDuracion() {
        return this.duracion;
    }

    public String toString() {
        return this.getPrioridad() + " " + this.getDuracion() + " ";
    }

    public int compareTo(Tareas other) {
        if (this.prioridad == other.prioridad) {
            return this.duracion - other.duracion;
        } else {
            return other.prioridad - this.prioridad;
        }
    }
}



