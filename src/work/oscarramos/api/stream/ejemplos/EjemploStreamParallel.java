package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class EjemploStreamParallel {
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

        long l1 = System.currentTimeMillis();
        String resultado = list.stream()
                .parallel()
                .map(usuario -> usuario.toString().toUpperCase())
                .peek(n -> {
                    System.out.println("Nombre del Thread : " + Thread.currentThread().getName() + " - " + n);
                })
                .flatMap(nombre -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (nombre.contains("Don".toUpperCase())) {
                        return Stream.of(nombre);
                    }
                    return Stream.empty();
                })
                .findAny().orElse("");

        long l2 = System.currentTimeMillis();
        System.out.println("Tiempo Total : " + (l2-l1));
        System.out.println(resultado);


    }
}
