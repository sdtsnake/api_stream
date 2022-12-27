package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .flatMap(u -> {
                    if(u.getNombres().equals("Elkin")){
                        return Stream.of(u);
                    }
                    return Stream.empty();
                })
                .peek(System.out::println);

        System.out.println("============== contando el numero de elementos");
        System.out.println("Resultado de la coincidencias : " + nombres.count());
    }
}
