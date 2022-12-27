package work.oscarramos.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduceInt {
    public static void main(String[] args) {
        Stream<Integer> nombres =  Stream.of(10,20,30,40,50,60,70,80,90)
                .distinct();

        int resultado = nombres.reduce(0, Integer::sum);
        System.out.println(resultado);


    }
}
