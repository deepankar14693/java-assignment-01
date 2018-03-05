package edu.knoldus;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Multiplication {

  public static void main(String[] args) {

    List<Integer> list1 = Arrays.asList (1, 2, 3, 4, 5);
    List<Integer> list2 = Arrays.asList (6, 7, 8, 9, 10);

//    list1.stream ().map ((Integer x) -> list2.stream ().map ((Integer y) -> y * x))
//        .forEach (System.out::println);

    List c = IntStream.range (0, list1.size ()).map (x -> list1.get (x) * list2.get (x)).boxed ().collect (Collectors.toList ());
    c.forEach (System.out::println);
  }
}