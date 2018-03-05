package edu.knoldus;
import edu.knoldus.Movie;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieOperations {
  public static void main(String[] args) {
    Movie movie1 = new Movie ("deewana", 1999, 9, "suspense");
    Movie movie2 = new Movie ("technology", 2014, 7, "sci-fi");
    Movie movie3 = new Movie ("hangout", 2016, 7, "comedy");
    Movie movie4 = new Movie ("science", 2009, 6, "sci-fi");
    Movie movie5 = new Movie ("paagal", 1992, 9, "comedy");
    Movie movie6 = new Movie ("bhooth", 2015, 4, "scary");

    List<Movie> list = Arrays.asList (movie1, movie2, movie3, movie4, movie5, movie6);

   System.out.println ("movies rating greater than 8 and comedy");
    list.stream ().filter (x -> (x.rating > 8) && (x.genre.equalsIgnoreCase ("comedy")))
        .forEach (x -> System.out.println (x.movieName));

    System.out.println ("movies rating less than 8 and release year greater than 2000");
    list.stream ().filter (x -> (x.releaseYear > 2000) && (x.rating < 8))
        .forEach (x -> System.out.println (x.movieName));

    System.out.println ("movies with even ratings");
    list.stream ().filter (x -> ((x.rating % 2) == 0))
        .forEach (x -> System.out.println (x.movieName));

    System.out.println ("sci-fi movies with 7 rating");
    list.stream ().filter (x -> ((x.genre.equalsIgnoreCase ("sci-fi")) && (x.rating == 7)))
        .forEach (x -> System.out.println (x.movieName));
  }
}
