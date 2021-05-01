package programacion.objetos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.UUID;

public class VideoClub {

    //Listados del videoclub
    ArrayList<Pelicula> peliculasListadas;
    ArrayList<Cliente> clientesListados;
    ArrayList<Alquiler> alquileresListados;


    public VideoClub() {

        this.peliculasListadas = new ArrayList<>();
        this.clientesListados = new ArrayList<>();
        this.alquileresListados = new ArrayList<>();
    }

    public VideoClub(ArrayList<Pelicula> peliculasListadas, ArrayList<Cliente> clientesListados, ArrayList<Alquiler> alquileresListados) {

        this.peliculasListadas = new ArrayList<>();
        this.clientesListados = new ArrayList<>();
        this.alquileresListados = new ArrayList<>();
        this.peliculasListadas = peliculasListadas;
        this.clientesListados = clientesListados;
        this.alquileresListados = alquileresListados;
    }

    public ArrayList<Pelicula> getPeliculasListadas() {
        return peliculasListadas;
    }

    public void setPeliculasListadas(ArrayList<Pelicula> peliculasListadas) {
        this.peliculasListadas = peliculasListadas;
    }

    public void setUnaPelicula(Pelicula pelicula) {
        this.peliculasListadas.add(pelicula);
    }

    public ArrayList<Cliente> getClientesListados() {
        return clientesListados;
    }

    public void setClientesListados(ArrayList<Cliente> clientesListados) {
        this.clientesListados = clientesListados;
    }

    public void setUnCliente(Cliente cliente) {
        this.clientesListados.add(cliente);
    }

    public ArrayList<Alquiler> getAlquileresListados() {
        return alquileresListados;
    }

    public void setAlquileresListados(ArrayList<Alquiler> alquileresListados) {
        this.alquileresListados = alquileresListados;
    }

    public void setUnAlquiler(Alquiler alquiler) {
        this.alquileresListados.add(alquiler);
    }

    //metodo que permite segun el estado de los alquileres listados, consultar una lista de los vigentes
    public void consultarAlquileresVigentes() {

        for (int i = 0; i < this.alquileresListados.size(); i++) {
            if (this.alquileresListados.get(i).getEstado()) {
                System.out.println(this.alquileresListados.get(i).toString());
                System.out.println("\n");
            }
        }
    }

    //metodo que permite segun la comparacion de fechas, consultar una lista de las devoluciones el dia actual
    public void devolucionesHoy() {

        for (int i = 0; i < this.alquileresListados.size(); i++) {
            if (this.alquileresListados.get(i).getFechaDeDevolucion().compareTo(LocalDate.now())==0) {
                System.out.println(this.alquileresListados.get(i).toString() + "\n");
            }
        }
    }

    //metodo que permite consultar una lista en base a la popularidad, para conocer los titulos más alquilados
    public void titulosMasAlquilado() {

        this.peliculasListadas.stream()
                .sorted(Comparator.comparing(p->p.getPopularidad(),Comparator.reverseOrder()))
                .forEach(p->System.out.println(p.toString()+"\n"));
    }

    //metodo que utiliza una lista auxiliar para almacenar los titulos del mismo genero y luego ordenarlos e imprimirlos
    public void titulosPopularesGenero(String genero) {

        ArrayList<Pelicula> auxiliar = new ArrayList<>();
        for (int i = 0; i < this.peliculasListadas.size(); i++) {
            if (this.peliculasListadas.get(i).getGenero().compareTo(genero) == 0) {
                auxiliar.add(this.peliculasListadas.get(i));
            }
        }

        auxiliar.stream()
                .sorted(Comparator.comparing(p->p.getPopularidad(),Comparator.reverseOrder()))
                .forEach(p->System.out.println(p.toString()+"\n"));
    }

    //metodo que confirma con un booleano la existencia o no de un titulo en la lista de peliculas
    public Boolean existePelicula(String titulo) {

        Boolean existe = false;
        for (int i = 0; i < this.peliculasListadas.size(); i++) {
            if (this.peliculasListadas.get(i).getTitulo().compareTo(titulo) == 0) {
                existe = true;
                i = this.peliculasListadas.size();
            }
        }
        return existe;
    }

    //metodo que busca y devuelve una pelicula referida a un titulo
    public Pelicula buscarPelicula(String titulo) {

        Pelicula peliculaEncontrada = new Pelicula();
        for (int i = 0; i < this.peliculasListadas.size(); i++) {
            if (this.peliculasListadas.get(i).getTitulo().compareTo(titulo) == 0) {
                peliculaEncontrada = this.peliculasListadas.get(i);
                i = this.peliculasListadas.size();
            }
        }
        return peliculaEncontrada;
    }

    //metodo que confirma con un booleano la existencia o no de un cliente en la lista de clientes
    public Boolean existeCliente(String dni) {

        Boolean existe = false;
        for (int i = 0; i < this.clientesListados.size(); i++) {
            if (this.clientesListados.get(i).getDni().compareTo(dni) == 0) {
                existe = true;
                i = this.clientesListados.size();
            }
        }
        return existe;
    }

    //metodo que busca y devuelve un cliente referido a un dni
    public Cliente buscarCliente(String dni) {

        Cliente clienteEncontrado = new Cliente();
        for (int i = 0; i < this.clientesListados.size(); i++) {
            if (this.clientesListados.get(i).getDni().compareTo(dni) == 0) {
                clienteEncontrado = this.clientesListados.get(i);
                i = this.clientesListados.size();
            }
        }
        return clienteEncontrado;
    }

    //metodo que da de alta un alquiler en el sistema comprobando todos los datos necesarios
    public void altaAlquiler(String titulo, String dni) {

        if (this.existePelicula(titulo)) {
            Pelicula pelicula = new Pelicula();
            pelicula = this.buscarPelicula(titulo);

            if (pelicula.getStock() > 0) {
                Cliente cliente = new Cliente();

                if (!this.existeCliente(dni)) {
                    System.out.println("No se encuentran los datos del cliente solicitado. Cargue el cliente a continuacion:");
                    cliente.cargarClienteManual();
                } else {
                    cliente = this.buscarCliente(dni);
                    System.out.println("El cliente ya se encuentra en la base de datos. " + cliente.getNombre());
                }

                int i = 0;
                Scanner in = new Scanner(System.in);
                System.out.println("Ingrese la cantidad de días del alquiler: ");
                i = in.nextInt();
                Alquiler alquiler = new Alquiler(pelicula, cliente, LocalDate.now(), LocalDate.now().plusDays(i));
                this.setUnAlquiler(alquiler);
                pelicula.disminuirStock();
                pelicula.aumentarPopularidad();
                cliente.setUltimoAlquiler(alquiler);

            } else {
                System.out.println("El titulo solicitado no tiene stock.");
            }
        } else {
            System.out.println("El titulo no existe.");
        }
    }

    //metodo que da de baja un alquiler en el sistema primero buscando en los alquileres el cliente y devolviendolo y luego dando de baja en la lista general
    public void bajaAlquiler(String titulo, String dni) {

        Cliente cliente = new Cliente();
        cliente = this.buscarCliente(dni);
        Pelicula pelicula = new Pelicula();
        pelicula = this.buscarPelicula(titulo);
        Alquiler alquiler = new Alquiler();
        UUID idAlquiler = cliente.bajaAlquilerCliente(pelicula.getTitulo());

        for (int i = 0; i < this.alquileresListados.size(); i++) {
            if (this.alquileresListados.get(i).getIdAlquiler() == idAlquiler) {
                alquiler=this.alquileresListados.get(i);
            }
        }
        alquiler.setEstado(false);
        pelicula.aumentarStock();
    }

    public void tituloDetallado (String titulo){

        Pelicula pelicula = new Pelicula();
        pelicula=this.buscarPelicula(titulo);
        if (this.existePelicula(titulo)==true){
            System.out.println(pelicula.toString());
        }else{
            System.out.println("El titulo solicitado no existe");
        }
    }

}
