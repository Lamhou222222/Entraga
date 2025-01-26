package proyecto_a_entrega;
import proyecto_a_entrega.Genero;
public class multimidia {

    // Atributos de la clase
    protected String titulo;
    protected String autor;
    protected String formato;
    protected int duracion;

    // Valores permitidos para el formato
    private static final String[] FORMATOS_VALIDOS = {"wav", "mp3", "midi", "avi", "mov", "mpg", "cdAudio", "dvd"};

    // Método para verificar si el formato está en la lista de formatos válidos
    public boolean verificar(String formato) {
        for (String valido : FORMATOS_VALIDOS) {
            if (valido.equals(formato)) {
                return true;
            }
        }
        return false;
    }

    // Constructor
    public multimidia(String titulo, String autor, String formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.duracion = duracion;
        if (verificar(formato)) {
            this.formato = formato;
        } else {
            this.formato = "desconocido";
        }
    }

    // Getters
    public String getTitulo() {
        return this.titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public String getFormato() {
        return this.formato;
    }

    public int getDuracion() {
        return this.duracion;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setFormato(String formato) {
        if (verificar(formato)) {
            this.formato = formato;
        }
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    // toString
    @Override
    public String toString() {
        return "Título: " + this.titulo + ", Autor: " + this.autor + ", Formato: " + this.formato + ", Duracion: " + this.duracion + " minutos";
    }
}



