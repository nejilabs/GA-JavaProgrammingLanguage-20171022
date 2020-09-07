package com.gajava.gettersandsetters;

public class J_GetterAndSetters {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Movie1 Title", "PG");

        movie1.setMovieRating("G");
        System.out.println(movie1.movieRating);

        movie1.setMovieRating("Dog");
        System.out.println(movie1.movieRating);
    }
}

