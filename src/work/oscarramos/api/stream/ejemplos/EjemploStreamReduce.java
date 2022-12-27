package work.oscarramos.api.stream.ejemplos;

import java.util.stream.Stream;

public class EjemploStreamReduce {
    public static void main(String[] args) {
        Stream<String> nombres =  Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano","Oscar Ramos","Oscar Ramos","Oscar Ramos","Oscar Ramos")
                .distinct();

        String resultado = nombres.reduce("Resultado del reduce : ",(a,b)-> a + " # " + b);
        System.out.println(resultado);


    }
}
