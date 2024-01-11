import java.util.ArrayList;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Álvarez", 1968);
        personas.add(persona);

        long count = personas.stream()
                .filter(person -> "AaÀàÁáÄä".indexOf(person.getLastName().charAt(0)) > 0)
                .count();
        System.out.println(count + " personas tienen un apellido que empieza por A");
    }
}
