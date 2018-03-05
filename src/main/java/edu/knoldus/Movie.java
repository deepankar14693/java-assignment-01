package edu.knoldus;

public class Movie {
  String movieName;
  int releaseYear;
  int rating;
  String genre;

  public Movie(String movieName, int releaseYear, int rating, String genre) {
    this.movieName = movieName;
    this.releaseYear = releaseYear;
    this.rating = rating;
    this.genre = genre;
  }
}
