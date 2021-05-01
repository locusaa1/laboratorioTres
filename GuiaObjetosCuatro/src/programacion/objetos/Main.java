package programacion.objetos;

import sun.security.x509.GeneralName;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        VideoClub videoClub = new VideoClub();

        Pelicula pelicula1 = new Pelicula("pelicula1", Genero.ACCION, LocalDate.parse("19900122", DateTimeFormatter.BASIC_ISO_DATE), 140, Audiencia.G, "USA", 20, "Pelicula de accion.");
        Pelicula pelicula2 = new Pelicula("pelicula2", Genero.AVENTURA, LocalDate.parse("20050118", DateTimeFormatter.BASIC_ISO_DATE), 150, Audiencia.R, "USA", 30, "Pelicula de aventura.");
        Pelicula pelicula3 = new Pelicula("pelicula3", Genero.DRAMA, LocalDate.parse("20181222", DateTimeFormatter.BASIC_ISO_DATE), 120, Audiencia.UNRATED, "UK", 10, "Pelicula de drama.");
        Pelicula pelicula4 = new Pelicula("pelicula4", Genero.AVENTURA, LocalDate.parse("20201222", DateTimeFormatter.BASIC_ISO_DATE), 145, Audiencia.NC17, "ARG", 30, "Pelicula de aventura, muy mala.");

        Cliente carlos = new Cliente("Carlos", "1111", "123", "asd 123");
        Cliente ivan = new Cliente("Ivan", "2222", "123", "asd 123");
        Cliente carla = new Cliente("Carla", "3333", "123", "asd 123");
        Cliente ivana = new Cliente("Ivana", "4444", "123", "asd 123");

        ArrayList<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(pelicula1);
        peliculas.add(pelicula2);
        peliculas.add(pelicula3);
        peliculas.add(pelicula4);

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(carlos);
        clientes.add(ivan);
        clientes.add(carla);
        clientes.add(ivana);

        videoClub.setPeliculasListadas(peliculas);
        videoClub.setClientesListados(clientes);

        System.out.println("prueba que alquilen una pelicula que no existe");
        videoClub.altaAlquiler("pelicula50","1111");
        System.out.println("\n");

        System.out.println("Se carga un alquiler en el primer cliente");
        System.out.println("Si se le carga a alguno de los clientes 0 dias de alquiler en algun titulo se puede usar la funcion de alquileres al dia de la fecha");
        videoClub.altaAlquiler("pelicula1","1111");

        System.out.println("Se cargan dos en el segundo");
        videoClub.altaAlquiler("pelicula1","2222");
        videoClub.altaAlquiler("pelicula2","2222");

        System.out.println("Se cargan tres en el tercero");
        videoClub.altaAlquiler("pelicula1","3333");
        videoClub.altaAlquiler("pelicula2","3333");
        videoClub.altaAlquiler("pelicula3","3333");

        System.out.println("Se cargan cuatro en el cuarto");
        videoClub.altaAlquiler("pelicula1","4444");
        videoClub.altaAlquiler("pelicula2","4444");
        videoClub.altaAlquiler("pelicula3","4444");
        videoClub.altaAlquiler("pelicula4","4444");

        System.out.println("Se muestran los ultimos alquileres del cuarto cliente");
        ivana.mostrarUltimosAlquileres();

        System.out.println("\n");

        System.out.println("Se muestran los alquileres vigentes en general");
        videoClub.consultarAlquileresVigentes();

        System.out.println("\n");

        System.out.println("Alquileres al dia de la fecha");
        videoClub.devolucionesHoy();

        System.out.println("\n");

        System.out.println("Se ven los titulos más alquilados");
        videoClub.titulosMasAlquilado();
        System.out.println("\n");


        System.out.println("Se busca por genero para ver los más populares (AVENTURA)");
        videoClub.titulosPopularesGenero(Genero.AVENTURA);

        System.out.println("\n");

        System.out.println("Se busca informacion detallada de un titulo");
        videoClub.tituloDetallado("pelicula1");

    }
}
