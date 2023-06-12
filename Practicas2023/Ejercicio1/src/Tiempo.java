//Crea una clase Tiempo que tenga tres atributos (horas, minutos y segundos) y métodos para obtener y establecer
// cada uno de ellos. Agrega métodos adicionales para sumar y restar tiempos.
public class Tiempo {

    private int horas;
    private int minutos;
    private int segundos;


    public Tiempo(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }
    public void sumar(Tiempo otroTiempo) {
        int horasNuevas = horas + otroTiempo.getHoras();
        int minutosNuevos = minutos + otroTiempo.getMinutos();
        int segundosNuevos = segundos + otroTiempo.getSegundos();

        // Ajustar los minutos y segundos si superan 60
        if (segundosNuevos >= 60) {
            segundosNuevos -= 60;
            minutosNuevos++;
        }
        if (minutosNuevos >= 60) {
            minutosNuevos -= 60;
            horasNuevas++;
        }

        // Asignar los nuevos valores de tiempo
        horas = horasNuevas;
        minutos = minutosNuevos;
        segundos = segundosNuevos;
    }

    public void restar(Tiempo otroTiempo) {
        int horasNuevas = horas - otroTiempo.getHoras();
        int minutosNuevos = minutos - otroTiempo.getMinutos();
        int segundosNuevos = segundos - otroTiempo.getSegundos();

        // Ajustar los minutos y segundos si son negativos
        if (segundosNuevos < 0) {
            segundosNuevos += 60;
            minutosNuevos--;
        }
        if (minutosNuevos < 0) {
            minutosNuevos += 60;
            horasNuevas--;
        }

        // Asignar los nuevos valores de tiempo
        horas = horasNuevas;
        minutos = minutosNuevos;
        segundos = segundosNuevos;
    }
}

