package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {
        Usuario usuario = Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .filter(u -> u.getId().equals(2))
                .findFirst().get();

        System.out.println(usuario);
    }
}
