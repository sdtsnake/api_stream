package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamDisctinctUsuario {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Juan Eslava", "Elkin Osorio", "Oscar Ramos", "Elkin Lizacano", "Juan Eslava", "Juan Eslava")
                .distinct()
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]));



        nombres.forEach(System.out::println);


    }
}
