    package utilidades;
    import modelo.Titulo;


    public class CalculadoraDeTiempo {
        private int tiempoTotal;

        public int getTiempoTotal() {
            return tiempoTotal;
        }

        public void incluye(Titulo titulo){
            tiempoTotal += titulo.getTiempoDeDuracionEnMinutos();
            System.out.println("Tiempo que necesitas para maratonear tus peelículas favoritas" + getTiempoTotal() + "minutos");

        }

        public static int calcularTiempoTotal(int duracionPorEpisodio, int episodiosPorTemporada, int temporadas) {
            return duracionPorEpisodio * episodiosPorTemporada * temporadas;
        }
    }
