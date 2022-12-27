package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombres().equals("Elkin"))
                .peek(System.out::println);
        List<Usuario> list2 = nombres.collect(Collectors.toList());
        System.out.println("============== Impresion de la lista.");
        list2.forEach(System.out::println);
    }
}
