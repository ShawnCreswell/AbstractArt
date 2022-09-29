import java.util.ArrayList;
import java.util.Collections;

public class Museum {
    public static void main(String[] args) {
        Painting p1 = new Painting("The birth of Venus", "Sandro Botticelli", "Its vibrant", "oil");
        Painting p2 = new Painting("Arrangement in Grey and Black", "James Abbott", "Very dull painting", "oil");
        Painting p3 = new Painting("The Arnolf-ini Portrait", "Jan Van Eyck", "Very detailed painting", "oils");
        Sculpture s1 = new Sculpture("Ecstasy of Saint Teresa", "Gian Lorenzon Bernini", "What a sight !", "Marble, stucco and paint");
        Sculpture s2 = new Sculpture("Perseus with the Head of Medusa", "Antonio Canova", "a sculpture with a thousands words", "Marble");
        ArrayList<Art> museum = new ArrayList<Art> ();
        museum.add(p1);
        museum.add(p2);
        museum.add(p3);
        museum.add(s1);
        museum.add(s2);
        // Shuffling the ArrayList "museum"
        Collections.shuffle(museum);
        // Viewing all the Art in the museum
        for (Art piece : museum) {
            piece.viewArt();
        }
    }
}