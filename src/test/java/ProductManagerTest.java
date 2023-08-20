import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {


    @Test
    public void allFilms() {
        ProductManager manager = new ProductManager();
        manager.saveMovies("Kino 1");
        manager.saveMovies("Kino 2");
        manager.saveMovies("Kino 3");

        String[] expected = {"Kino 1", "Kino 2", "Kino 3"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void allTurnFilms() {
        ProductManager manager = new ProductManager();
        manager.saveMovies("Kino 1");
        manager.saveMovies("Kino 2");
        manager.saveMovies("Kino 3");

        String[] expected = {"Kino 3", "Kino 2", "Kino 1"};
        String[] actual = manager.findLast();
    }

    @Test
    public void moreTurnFilms() {
        ProductManager manager = new ProductManager(9);
        manager.saveMovies("Kino 1");
        manager.saveMovies("Kino 2");
        manager.saveMovies("Kino 3");
        manager.saveMovies("Kino 4");
        manager.saveMovies("Kino 5");
        manager.saveMovies("Kino 6");
        manager.saveMovies("Kino 7");
        manager.saveMovies("Kino 8");
        manager.saveMovies("Kino 9");

        String[] expected = {"Kino 9", "Kino 8", "Kino 7", "Kino 6", "Kino 5", "Kino 4", "Kino 3", "Kino 2", "Kino 1"};
        String[] actual = manager.findLast();
    }
}
