package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {
        Long contador = Stream.of("Juan Eslava","","Oscar Ramos","")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("contador = " + contador);



    }
}
