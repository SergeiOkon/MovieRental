package com.service;

import com.factory.FactorySwitcher;
import com.factory.MovieFactory;
import com.factory.impl.EnglishMovieFactory;
import com.factory.impl.UkrainianMovieFactory;
import com.rental.Movie;
import com.rental.repo.MovieRepo;

import java.util.Scanner;

public class UserIOService {

    private int userMovieId;
    private String language;

    private static MovieRepo movieRepo;
    private static Movie selectedMovie;
    private static Scanner scanner;
    private static MovieFactory movieFactory;

    public UserIOService() {
        scanner = new Scanner(System.in);
        movieRepo = new MovieRepo();
    }

    public void showAvailableMovies() {
        if (!(movieRepo.getMovies() == null) && !movieRepo.getMovies().isEmpty()) {
            System.out.println("Available movies to rent:");
            movieRepo.getMovies().forEach(System.out::println);
        } else {
            System.out.println("We have no available movies to rent");
        }
    }

    public void selectMovie() {
        System.out.println("Input movie id: ");
        userMovieId = scanner.nextInt();
        scanner.nextLine();
        if (movieRepo.getMovies().stream().anyMatch(i -> i.getId() == userMovieId)) {
            selectedMovie = movieRepo.getMovies().stream()
                    .filter(movie -> userMovieId == movie.getId())
                    .findAny()
                    .orElse(null);
            System.out.println("You selected: " + selectedMovie.getTitle());
        } else {
            selectMovie();
        }
    }

    public void selectLanguage() {
        FactorySwitcher[] languages = FactorySwitcher.values();
        System.out.println("Select movie language. Audio and subtitles will be the same:");
        for (FactorySwitcher language : languages) {
            System.out.println(language);
        }
        language = scanner.nextLine();

        switch (language) {
            case "ENGLISH":
                movieFactory = new EnglishMovieFactory();
                break;
            case "UKRAINIAN":
                movieFactory = new UkrainianMovieFactory();
                break;
            default:
                System.out.println("This language isn't supported");
                selectLanguage();
                break;
        }
    }

    public Movie getUserMovie() {
        movieFactory.createAudio();
        movieFactory.createSubtitle();
        return new Movie(selectedMovie.getTitle(), selectedMovie.getCost(), movieFactory.createAudio(), movieFactory.createSubtitle());
    }
}
