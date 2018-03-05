package edu.knoldus;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Stream;

public class ReadingFile {

  public static void main(String a[]) throws IOException {
    Map<String, Integer> map = new LinkedHashMap<> ();

    Stream<String> lines = Files.lines (Paths.get ("/home/knoldus/Desktop/javadoc"));

    lines.flatMap (x -> Arrays.stream (x.split (" "))).forEach (x -> {
      if (map.containsKey (x)) {
        map.put (x, map.get (x) + 1);
      } else {
        map.put (x, 1);
      }
    });

    for (String s : map.keySet ()) {
      String key = s.toString ();
      int value = map.get (s);
      System.out.println (key + " " + value);
    }
  }
}

