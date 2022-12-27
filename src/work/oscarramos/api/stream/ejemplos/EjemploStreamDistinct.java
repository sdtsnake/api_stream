package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {
        Stream<String> nombres =  Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano","Oscar Ramos","Oscar Ramos","Oscar Ramos","Oscar Ramos")
                .distinct();

        nombres.forEach(System.out::println);
    }
}
