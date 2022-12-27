package work.oscarramos.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("Valores al Stream directo usando .of");
        System.out.println("==========================================");
        Stream<String> nombres = Stream.of("Hugo","Paco","Luis","Rosita");
        nombres.forEach(System.out::println);
        System.out.println("==========================================");
        System.out.println("Valores al basado en un Array");
        System.out.println("==========================================");
        String[] arr = {"Marian","Victor","Cesar","Mabel","Mario"};
        nombres = Arrays.stream(arr);
        nombres.forEach(System.out::println);

        System.out.println("==========================================");
        System.out.println("Stream builder");
        System.out.println("==========================================");
        Stream<String> nombres2 = Stream.<String>builder()
                .add("Gustavo")
                .add("William")
                .add("Mauricio")
                .add("David")
                .add("Harvy")
                .build();
        nombres2.forEach(System.out::println);
        System.out.println("==========================================");
        System.out.println("Apartir del collection de java List");
        System.out.println("==========================================");
        List<String> lista = new ArrayList<>();
        lista.add("Deiver");
        lista.add("Juan");
        lista.add("David");
        lista.add("Andres");
        lista.add("Cesar");
        lista.add("Jhon");
        lista.add("Edilberto");
        lista.add("Riofrio");
        lista.stream().forEach(System.out::println);
    }
}
