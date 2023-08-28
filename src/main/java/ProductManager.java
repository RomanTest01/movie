import java.security.PublicKey;

public class ProductManager {
    private String film[] = new String[0];
    private int limit;

    public ProductManager() {
        this.limit = 5;
    }

    public ProductManager(int limit) {
        this.limit = limit;
    }


    public void saveMovies(String movies) {
        String[] tmp = new String[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = movies;
        this.film = tmp;

    }

    public String[] findAll() {
        return film;

    }

    public String[] findLast() {
        int turnLength;
        if (film.length < limit) {
            turnLength = film.length;
        } else {
            turnLength = limit;
        }
        String[] turn = new String[turnLength];
        for (int i = 0; i < turn.length; i++) {
            turn[i] = film[film.length - 1 - i];
        }
        return turn;
    }

    public String[] findLastNotMoreLimit(){
        int resultFilms;
        if (film.length<limit){
            resultFilms= film.length;
        }else {
            resultFilms= limit;
        }
        String [] ans = new String[resultFilms];
        for (int i = 0; i < film.length; i++) {
            ans[i] = film[i];
        }
        return ans;

    }
    public String[] findLastMoreLimit(){
        int resultMoreFilms;
        if (film.length>limit){
            resultMoreFilms= film.length;
        }else {
            resultMoreFilms= limit;
        }
        String [] ans = new String[resultMoreFilms];
        for (int i = 0; i < film.length; i++) {
            ans[i] = film[i];
        }
        return ans;

    }



}
