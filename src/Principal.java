import modelo.Peliculas;
import modelo.Serie;
import utilidades.CalculadoraDeTiempo;

import java.util.Scanner;

public class Principal {
    Peliculas peliculaUsuario = new Peliculas();
    Serie serieUsuario = new Serie();
    CalculadoraDeTiempo calculadoraDeTiempo = new CalculadoraDeTiempo();

    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido a screenmatch
                    1) Registrar nueva pelicula 
                    2) Registrar nueva serie
                    3) Calcular tiempo total de una serie
                    9) Salir    
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la Película");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la Película");
                    int fechaDeLanzamiento = teclado.nextInt();

                    System.out.println("Ingrese la duración en minutos de la Película");
                    int duracionEnMinutos = teclado.nextInt();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechadeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    calculadoraDeTiempo.incluye(peliculaUsuario);



                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el numero de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionEnMinutosPorEpisodio(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    calculadoraDeTiempo.incluye(serieUsuario);
                    teclado.nextLine();
                    break;

                case 3:


                    calculadoraDeTiempo.incluye(serieUsuario);
                    int tiempoTotal = calculadoraDeTiempo.getTiempoTotal();
                    System.out.println("Tiempo total de la serie: " + tiempoTotal + " minutos");
                    System.out.println("Tiempo que necesitas para ver la serie completa: " + tiempoTotal + " minutos");
                    teclado.nextLine();
                    break;

                case 9:
                    System.out.println("Saliendo del Programa");
                    break;

                default:
                    System.out.println("Opcion no válida: ");
            }
        }
    }


}
