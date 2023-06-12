public class Videojuego {
    private String titulo;
    private int horasEstimadas = 10;
    private boolean entregado = false;
    private String genero;
    private String compañia;

    public Videojuego() {
        // Constructor por defecto que establece los valores por defecto
        // para todos los atributos
        this.titulo = "";
        this.genero = "";
        this.compañia = "";
    }

    // Constructor que toma como parámetros título y compañía, y establece
    // los valores por defecto para los demás atributos
    public Videojuego(String titulo, String compañia) {
        this.titulo = titulo;
        this.compañia = compañia;
        this.genero = "";
    }

    // Constructor que toma todos los atributos, excepto entregado
    public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }


    // getters y setters para todos los atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

 /*   public boolean isEntregado() {
        return entregado;
    }*/

 /*   public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }*/

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    // método toString para imprimir los atributos del videojuego
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", Horas estimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }

    public void entregar() {
        entregado = true;
    }

    // método devolver
    public void devolver() {
        entregado = false;
    }

    // método isEntregado
    public boolean isEntregado() {
        return entregado;
    }
}
