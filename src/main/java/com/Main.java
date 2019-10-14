package com;

import com.rental.Movie;
import com.rental.repo.MovieRepo;
import com.service.UserIOService;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    private static void runApp() {
        UserIOService userIOService = new UserIOService();
        MovieRepo movieRepo = new MovieRepo();
        movieRepo.add(new Movie("Titanic", 5));
        movieRepo.add(new Movie("Hachiko", 7));
        movieRepo.add(new Movie("Fight Club", 7));


        userIOService.showAvailableMovies();
        userIOService.selectMovie();
        userIOService.selectLanguage();
        System.out.println(userIOService.getUserMovie());
    }
}
