public class VideoSerieMain {
    public static void main(String[] args) {
        // Creamos los arrays de Series y Videojuegos
        Serie[] series = new Serie[5];
        Videojuego[] videojuegos = new Videojuego[5];

        // Creamos objetos en cada posición del array
        series[0] = new Serie("Breaking Bad", 5, "Drama", "Vince Gilligan");
        series[1] = new Serie("Friends", "David Crane");
        series[2] = new Serie("Stranger Things", 3, "Ciencia ficción", "The Duffer Brothers");
        series[3] = new Serie("The Crown", 4, "Drama", "Peter Morgan");
        series[4] = new Serie("Game of Thrones", 8, "Fantasía", "David Benioff y D. B. Weiss");

        videojuegos[0] = new Videojuego("The Legend of Zelda: Breath of the Wild", 50, "Aventura", "Nintendo");
        videojuegos[1] = new Videojuego("Super Mario Odyssey", "Nintendo");
        videojuegos[2] = new Videojuego("Red Dead Redemption 2", 80, "Acción-aventura", "Rockstar Games");
        videojuegos[3] = new Videojuego("The Last of Us Part II", 25, "Acción-aventura", "Naughty Dog");
        videojuegos[4] = new Videojuego("God of War", 30, "Acción-aventura", "Santa Monica Studio");

        // Entregamos algunos Videojuegos y Series
        series[1].entregar();
        series[3].entregar();
        videojuegos[0].entregar();
        videojuegos[2].entregar();
        videojuegos[3].entregar();

        // Contamos cuántos Series y Videojuegos están entregados
        int seriesEntregadas = 0;
        int videojuegosEntregados = 0;

        for (Serie serie : series) {
            if (serie.isEntregado()) {
                seriesEntregadas++;
            }
        }

        for (Videojuego videojuego : videojuegos) {
            if (videojuego.isEntregado()) {
                videojuegosEntregados++;
            }
        }

        // Mostrar resultados por pantalla
        System.out.println("Series entregadas: " + seriesEntregadas);
        System.out.println("Videojuegos entregados: " + videojuegosEntregados);

        // Encontrar el Videojuego con más horas estimadas
        Videojuego videojuegoMasLargo = videojuegos[0];

        for (int i = 1; i < videojuegos.length; i++) {
            if (videojuegos[i].getHorasEstimadas() > videojuegoMasLargo.getHorasEstimadas()) {
                videojuegoMasLargo = videojuegos[i];
            }
        }

        // Mostrar información del Videojuego con más horas estimadas
        System.out.println("El Videojuego con más horas estimadas es:");
        System.out.println(videojuegoMasLargo.toString());

        Serie serieConMasTemporadas = series[0];

        for (int i = 1; i < series.length; i++) {
            if (series[i].getNumTemporadas() > serieConMasTemporadas.getNumTemporadas()) {
                serieConMasTemporadas = series[i];
            }
        }
        // Encontrar la Serie con mas temporadas
        System.out.println("La serie con mas temporadas es: ");
        System.out.println(serieConMasTemporadas);
    }
}
