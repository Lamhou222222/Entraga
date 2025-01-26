package proyecto_a_entrega;

class Pelicula extends multimidia {

    // Atributos
    private String actorPrincipal;
    private String actrizPrincipal;

    // Constructor
    public Pelicula(String titulo, String autor, String formato, int duracion, String actorPrincipal, String actrizPrincipal) {
        super(titulo, autor, formato, duracion); // Llamada al constructor de la clase padre
        this.actorPrincipal = actorPrincipal;
        this.actrizPrincipal = actrizPrincipal;
    }

    // Getters y Setters
    public String getActorPrincipal() {
        return actorPrincipal;
    }

    public void setActorPrincipal(String actorPrincipal) {
        this.actorPrincipal = actorPrincipal;
    }

    public String getActrizPrincipal() {
        return actrizPrincipal;
    }

    public void setActrizPrincipal(String actrizPrincipal) {
        this.actrizPrincipal = actrizPrincipal;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + ", Actor Principal: " + this.actorPrincipal + ", Actriz Principal: " + this.actrizPrincipal ;
    }
}