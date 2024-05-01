//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Bienvenidos a la inmersión en Java");

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del find del milenio
                """;
        double mediaEvaluacionUsuario = 0;

        System.out.println("Pelicula:" + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);
        System.out.println("Calificacion promedio  de la película  " + mediaEvaluacionUsuario);

        if (fechaDeLanzamiento > 2023){
            System.out.println("Película popular en este momento");
        }
        else {
            System.out.println("Película Retro que vale la pena ver");
        }
        int i=0;
        while (i < 3){
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota de la película");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = (mediaEvaluacionUsuario + notaMatrix);
            i++;
        }
        System.out.println("La media de la Película Matrixx es :" + mediaEvaluacionUsuario/3);
    }
}