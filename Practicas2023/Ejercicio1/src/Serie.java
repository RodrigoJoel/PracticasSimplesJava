public class Serie {
    public int length;
    private String titulo;
    private int numTemporadas = 3;
    private boolean entregado = false;
    private String genero;
    private String creador;

    public Serie(String titulo, String genero, String creador) {
        this.titulo = titulo;
        this.genero = genero;
        this.creador = creador;
    }
    public Serie(String titulo, String creador) {
        // Constructor que toma como parámetros el título y el creador
        // y establece los valores por defecto para los demás atributos
        this.titulo = titulo;
        this.creador = creador;
        this.genero = "";
    }

    public Serie(String titulo, int numTemporadas, String genero, String creador) {
        // Constructor que toma todos los atributos, excepto entregado
        this.titulo = titulo;
        this.numTemporadas = numTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    // getters y setters para todos los atributos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(int numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

 /*   public boolean isEntregado() {
        return entregado;
    }

    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }
*/
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    // método toString para imprimir los atributos de la serie

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numTemporadas=" + numTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
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
