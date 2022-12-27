package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        List<Usuario> list = new ArrayList<>();
        list.add(new Usuario("Elkin", "Lizcano"));
        list.add(new Usuario("Oscar", "Crespo"));
        list.add(new Usuario("Dany", "Cuevas"));
        list.add(new Usuario("Dante", "Sito"));
        list.add(new Usuario("Juan", "David"));
        list.add(new Usuario("Don", "Punito"));
        list.add(new Usuario("El come", "Moscas"));
        list.add(new Usuario("Alexander", "Gaspar"));
        list.add(new Usuario("Cristian", "Ichigo"));
        list.add(new Usuario("Don", "Ziro"));
        list.add(new Usuario("EL", "patron"));
        list.add(new Usuario("EL", "inguz"));

        Stream<String> nombres = list.stream()
                .map(usuario -> usuario.getNombres().toUpperCase()
                        .concat(" ")
                        .concat(usuario.getApellidos().toUpperCase()))
                .flatMap(nombre -> {
                    if (nombre.contains("El".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        System.out.println("Numero de coincidencias : " + nombres.count());


    }
}
