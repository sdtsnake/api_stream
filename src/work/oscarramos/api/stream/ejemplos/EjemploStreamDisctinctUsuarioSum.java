package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDisctinctUsuarioSum {
    public static void main(String[] args) {
        IntStream largoNombres = Stream.of("Juan Eslava", "Elkin Osorio","Elkin Osorio", "Oscar Ramos", "Elkin Lizacano", "Juan Eslava", "Juan Eslava")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u -> u.toString().length())
                .peek(System.out::println);

        IntSummaryStatistics estadisticas = largoNombres.summaryStatistics();
        System.out.println("Totales : " + estadisticas.getSum());
        System.out.println("Maximo  : " + estadisticas.getMax());
        System.out.println("Minimo  : " + estadisticas.getMin());
        System.out.println("promedio: " + estadisticas.getAverage());
    }
}
