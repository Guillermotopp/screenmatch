package modelo;

public class Titulo {
    private String nombre;
    private int fechaDeLanzamiento;
    private double evaluacion;
    private boolean incluidoEnElPlanBasico;
    private String sinopsis = """
            La Mejor Pelicula del Fin de Milenio
            """;
    private double mediaEvaluacionUsuario = 0;
    private  int tiempoDeDuracionEnMinutos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public boolean isIncluidoEnElPlanBasico() {
        return incluidoEnElPlanBasico;
    }

    public void setIncluidoEnElPlanBasico(boolean incluidoEnElPlanBasico) {
        this.incluidoEnElPlanBasico = incluidoEnElPlanBasico;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public double getMediaEvaluacionUsuario() {
        return mediaEvaluacionUsuario;
    }

    public void setMediaEvaluacionUsuario(double mediaEvaluacionUsuario) {
        this.mediaEvaluacionUsuario = mediaEvaluacionUsuario;
    }

    public int getTiempoDeDuracionEnMinutos() {
        return tiempoDeDuracionEnMinutos;
    }

    public void setTiempoDeDuracionEnMinutos(int tiempoDeDuracionEnMinutos) {
        this.tiempoDeDuracionEnMinutos = tiempoDeDuracionEnMinutos;
    }

    public void muestraFichaTecnica() {
        System.out.println("******** Ficha Técnica *********");
        System.out.println("Nombre del Titulo: " + nombre);
        System.out.println("Tiempo de duración: " + getTiempoDeDuracionEnMinutos() + " minutos ");
        System.out.println("Año de : " + fechaDeLanzamiento);
    }

    public void setFechadeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
}
