package work.oscarramos.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {
        System.out.println("====================Range");
        IntStream rango = IntStream.range(5,20).peek(System.out::println);


        //int resultado = rango.reduce(0, Integer::sum);
        //int resultado = rango.sum();
        IntSummaryStatistics statistics = rango.summaryStatistics();
        System.out.println("Numero mayor: " + statistics.getMax());
        System.out.println("Numero menor: " + statistics.getMin());
        System.out.println("Suma        : " + statistics.getSum());
        System.out.println("Promerdio   : " + statistics.getAverage());
        System.out.println("Total       : " + statistics.getCount());
        System.out.println("====================RangeClosed");
        IntStream rango2 = IntStream.rangeClosed(5,20).peek(System.out::println);
        IntSummaryStatistics statistics2 = rango2.summaryStatistics();
        System.out.println("Numero mayor: " + statistics2.getMax());
        System.out.println("Numero menor: " + statistics2.getMin());
        System.out.println("Suma        : " + statistics2.getSum());
        System.out.println("Promerdio   : " + statistics2.getAverage());
        System.out.println("Total       : " + statistics2.getCount());
    }
}
