package com.rental.repo;

import com.rental.Movie;

import java.util.ArrayList;
import java.util.List;

public class MovieRepo {

    private static int id;

    private static List<Movie> movies;

    public MovieRepo(){
        movies = new ArrayList<>();
    }

    public void add(Movie movie){
        id++;
        movie.setId(id);
        movies.add(movie);
    }

    public List<Movie> getMovies() {
        return movies;
    }
}
