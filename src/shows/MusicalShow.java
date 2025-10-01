package shows;
import persons.Actor;
import persons.Director;
import persons.MusicAuthor;
import java.util.ArrayList;

public class MusicalShow extends Show {
    MusicAuthor musicAuthor;
    String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, MusicAuthor musicAuthor,
                       String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println("Текст либретто " + "«" + this.title + "»" + ":");
        System.out.println(librettoText);
    }

}

