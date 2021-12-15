import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Movie> movies1 = new ArrayList<>();
        movies1.add(new Movie("movie1", new GregorianCalendar(1998, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director1"));
        movies1.add(new Movie("movie2", new GregorianCalendar(1999, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director2"));
        movies1.add(new Movie("movie3", new GregorianCalendar(2000, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director3"));
        movies1.add(new Movie("movie4", new GregorianCalendar(2001, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director4"));

        List<Movie> movies2 = new ArrayList<>();
        movies2.add(new Movie("movie5", new GregorianCalendar(1996, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director1"));
        movies2.add(new Movie("movie6", new GregorianCalendar(1992, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director2"));
        movies2.add(new Movie("movie7", new GregorianCalendar(2008, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director3"));
        movies2.add(new Movie("movie8", new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime(), new ArrayList<>(), "director4"));

        List<Genre> genres = new ArrayList<>();
        genres.add(new Genre(movies1));
        genres.add(new Genre(movies2));

        Netflix netflix = new Netflix(genres);

        Date date2000 = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date date1990 = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();

        // Problem 4.2
        System.out.println("For the Problem 4.2:");
        System.out.println("Get all movies released before 2000");
        netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .filter(movie -> movie.getReleaseDate().before(date2000))
                .map(movie -> {
                    String name = movie.getTitle();
                    movie.setTitle("Classical" + name);
                    return movie;
                }).forEach(System.out::println);

        // Problem 4.3
        System.out.println("====================");
        System.out.println("For the Problem 4.3:");
        List<Movie> problem2 = netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .sorted(Comparator.comparing(Movie::getReleaseDate).reversed())
                .limit(3)
                .collect(Collectors.toList());
        problem2.forEach(System.out::println);

        // Problem 4.4
        System.out.println("====================");
        System.out.println("For the Problem 4.4:");
        Predicate<Movie> predicate1 = m -> m.getReleaseDate().before(date2000);
        Predicate<Movie> predicate2 = m -> m.getReleaseDate().after(date1990);
        List<Movie> problem3 = netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream().filter(predicate1.and(predicate2)))
                .collect(Collectors.toList());
        problem3.forEach(System.out::println);

        System.out.println("====================");
        System.out.println("For the Problem 4.5:");
        List<String> problem4 = netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream().map(Main::helper))
                .collect(Collectors.toList());
        problem4.forEach(System.out::println);

        System.out.println("====================");
        System.out.println("For the Problem 4.6:");
        List<Movie> problem5 = netflix.getGenres().stream()
                .flatMap(genre -> genre.getMovies().stream())
                .sorted(Comparator.comparing(Movie::getReleaseDate).reversed())
                .collect(Collectors.toList());
        problem5.forEach(System.out::println);
    }

    public static String helper(Movie movie) {
        StringBuilder sb = new StringBuilder();
        sb.append(movie.getTitle())
                .append(" ")
                .append(movie.getReleaseDate().toString());
        return sb.toString();
    }
}


