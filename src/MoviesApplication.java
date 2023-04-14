import Movies.Movie;
import util.Input;
import Movies.MoviesArray;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();
        while (true) {
            System.out.println("What would you like to do?\n0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category");

            System.out.println("Enter your choice: ");
            int userChoice = input.getInt();
            Movie[] allMovies = MoviesArray.findAll();

            switch (userChoice) {
                case 0 -> {
                    return;
                }
                case 1 -> {
                    for (Movie allMovie : allMovies) {
                        System.out.println(allMovie.toString());
                    }

                }
                case 2 -> {
                    List<Movie> animated = Arrays.stream(allMovies)
                            .filter(movie -> movie.getCategory().equals("animated"))
                            .toList();
                    System.out.println(animated);
                }
                case 3 -> {
                    List<Movie> drama = Arrays.stream(allMovies)
                            .filter(movie -> movie.getCategory().equals("drama"))
                            .collect(Collectors.toList());
                    System.out.println(drama);
                }
                case 4 -> {
                    List<Movie> horror = Arrays.stream(allMovies)
                            .filter(movie -> movie.getCategory().equals("horror"))
                            .collect(Collectors.toList());
                    System.out.println(horror);
                }
                case 5 -> {
                    List<Movie> scifi = Arrays.stream(allMovies)
                            .filter(movie -> movie.getCategory().equals("scifi"))
                            .collect(Collectors.toList());
                    System.out.println(scifi);
                }
            }
            if(userChoice == 0){
                return;
            }
        }


    }
}
