package work.oscarramos.api.stream.ejemplos;

import work.oscarramos.models.Factura;
import work.oscarramos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStramFlatMapFactura {
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Gonzalo", "Caicedo");
        Usuario user2 = new Usuario("Juan", "Montoya");

        user1.addFactura(new Factura("Compra celular Iphone 14"));
        user1.addFactura(new Factura("Compra de portatil apple"));
        user1.addFactura(new Factura("Compra de airpods"));
        user1.addFactura(new Factura("Compra de Monitos 35\""));

        user2.addFactura(new Factura("Respuestos moto kit de arrastre"));
        user2.addFactura(new Factura("Hamburgesas del primos"));
        user2.addFactura(new Factura("Entradas hard rock cafe"));

        List<Usuario> usuarios = Arrays.asList(user1, user2);

        usuarios.stream()
                .flatMap(u -> u.getFacturas().stream())
                .forEach(f -> System.out.println(f.getDescripcion().concat(" => Cliente : ")
                        .concat(f.getUsuarioFactura().toString())));


    }
}
