package com.gajava.gettersandsetters;

public class Movie {
    String movieTitle;
    private String movieRating;

    public Movie(String movieTitle, String movieRating){
        this.setMovieRating(movieRating);
        this.movieTitle = movieTitle;
    }

    public void setMovieRating(String movieRating) {
        this.movieRating = movieRating;
        if (movieRating.equals("PG") || movieRating.equals("G") || movieRating.equals("PG-13") || movieRating.equals("R") || movieRating.equals("NR"))
        { this.movieRating = movieRating; }
        else{ this.movieRating = "NR"; }
    }

    public String getMovieRating(){
        return movieRating;
    }

}
