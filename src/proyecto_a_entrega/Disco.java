package proyecto_a_entrega;



class Disco extends multimidia {
	
	//Atributos
	private static String genero;
	
	//Constructor 
	public Disco(String titulo, String autor, String formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion);
        if (esGeneroValido(genero)) {
            this.genero = genero;
        } else {
        	this.genero = "desconocido";     
        }
        
	}
	
	//metodo de comparacion
	public boolean esGeneroValido(String genero) {
        return genero.equals(Genero.ROCK) || genero.equals(Genero.POP) || genero.equals(Genero.OPERA) ||  genero.equals(Genero.JAZZ) ||  genero.equals(Genero.CLASICA);
    }
	
	//los getters
	public String getGenero() {
        return this.genero;
    }
	
	
	//los setters 
	public void setGenero(String genero) {
        if (esGeneroValido(genero)) {
            this.genero = genero;
        } else {
            this.genero = "desconocido";    
       }
    }
	
	//metodo toString
	 @Override
	    public String toString() {
	        return super.toString() + " genero: " + this.genero;
	    }
	
}