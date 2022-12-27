package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {
        boolean existe = Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .anyMatch(u -> u.getId().equals(0));

        System.out.println(existe);
    }
}
