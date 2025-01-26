package proyecto_a_entrega;
import proyecto_a_entrega.multimidia;
import proyecto_a_entrega.Genero;
import proyecto_a_entrega.Disco;
import proyecto_a_entrega.ListaMultimedia;
import proyecto_a_entrega.Pelicula;




public class MainApp {

	public static void main(String[] args) {
        // crear una lista multimedia de 20 objeto
        ListaMultimedia listaMultimedia = new ListaMultimedia(20);

        // crear tres peliculas
        Pelicula pelicula1 = new Pelicula("Interstellar", "Christopher Nolan", "dvd", 169, "Matthew McConaughey", "Anne Hathaway");
        Pelicula pelicula2 = new Pelicula("Inception", "Christopher Nolan", "blu-ray", 148, "Leonardo DiCaprio", "Elliot Page");
        Pelicula pelicula3 = new Pelicula("The Dark Knight", "Christopher Nolan", "dvd", 152, "Christian Bale", "Maggie Gyllenhaal");

        // Crear tres discos
        Disco disco1 = new Disco("Abbey Road", "The Beatles", "mp3", 47, "ROCK");
        Disco disco2 = new Disco("Thriller", "Michael Jackson", "cdAudio", 42, Genero.POP);
        Disco disco3 = new Disco("La Traviata", "Giuseppe Verdi", "dvd", 120, Genero.OPERA);

        // agregar  los objetos a la lista multimedia
        listaMultimedia.add(pelicula1);
        listaMultimedia.add(pelicula2);
        listaMultimedia.add(pelicula3);
        listaMultimedia.add(disco1);
        listaMultimedia.add(disco2);
        listaMultimedia.add(disco3);

        // mostrar la lista por pantalla
        System.out.println(listaMultimedia.toString());
    }

}
