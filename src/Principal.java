import modelo.Peliculas;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido a screenmatch
                    1) Registrar nueva pelicula 
                    2) Registrar nueva serie
                    9) Salir    
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese nombre de la pelicula");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la película");
                    int fechaDeLanzamiento = teclado.nextInt();
                    System.out.println("ingrese la duración en minutos de la película ");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Peliculas peliculaUsuario = new Peliculas();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
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
