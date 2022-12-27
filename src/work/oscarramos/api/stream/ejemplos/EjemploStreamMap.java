package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<String> nombres = Stream.of("Hugo","Paco","Luis","Rosita")
                .peek(e -> System.out.println(e))
                .map(nombre ->{
                    return nombre.toUpperCase();})
                .peek(e -> System.out.println(e))
                .map(e -> e.toLowerCase());
        nombres.forEach(System.out::println);
        System.out.println("============= Simplificado");
        Stream<String> nombres2 = Stream.of("Manuel","Mauricio","Juan","Viviana")
                .peek(System.out::println)
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase);
        List<String> list = nombres2.collect(Collectors.toList());
        System.out.println("============== Impresion de la lista.");
        list.forEach(System.out::println);
        System.out.println("============= Carga del objeto usuario");
        Stream<Usuario> nombres3 = Stream.of("Juan Eslava","Elkin Osorio","Oscar Ramos","Fernando Lizacano")
                .map(nombre -> new Usuario(nombre.split(" ")[0],nombre.split(" ")[1]))
                .peek(System.out::println)
                .map(usuario -> {
                    String nombre = usuario.getNombres().toUpperCase();
                    usuario.setNombres(nombre);
                    String apellido = usuario.getApellidos().toUpperCase();
                    usuario.setApellidos(apellido);
                    return usuario;
                });
        List<Usuario> list2 = nombres3.collect(Collectors.toList());
        System.out.println("============== Impresion de la lista.");
        list2.forEach(System.out::println);
    }
}
