package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {
        Stream<Usuario> nombres = Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombres().equals("Elkin"))
                .peek(System.out::println);
        Optional<Usuario> usuario = nombres.findFirst();
        System.out.println("============== Impresion del optional");
        System.out.println(usuario.orElseGet(() -> new Usuario("Pablo","Camelo")));

        Stream<Usuario> nombres2 = Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Elkin Lizacano")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .filter(u -> u.getNombres().equals("Oscar"))
                .peek(System.out::println);
        Optional<Usuario> usuario2 = nombres2.findFirst();
        System.out.println("============== Impresion del optional 2");
        //System.out.println(usuario2.orElse(new Usuario("Juan","Vasquez")));
        //System.out.println(usuario2.orElseGet(() -> new Usuario("Juan","Vasquez")));
        if(usuario2.isPresent()){
            System.out.println(usuario2.get());
        }else{
            System.out.println("No se encontro el objeto!");
        }



    }
}
