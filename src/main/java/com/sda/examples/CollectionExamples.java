package com.sda.examples;

import java.util.*;

public class CollectionExamples {
  public static void main(String[] args) {
    // LIST
    List<String> textList = new ArrayList<>();
    textList.add("ala");
    textList.add("ma");
    textList.add("kota");

    for (String text : textList) {
      System.out.println(text);
    }

    // MAP
    Map<String, String> phoneBook = new HashMap<>();
    phoneBook.put("Karol", "1234");
    phoneBook.put("Wiktoria", "5678");

    System.out.println("Before");
    System.out.println(phoneBook.get("Karol"));

    System.out.println("After");
    phoneBook.put("Karol", "9012");
    System.out.println(phoneBook.get("Karol"));

    // SET OF ENTRIES
    Set<Map.Entry<String, String>> entries = phoneBook.entrySet();
    for (Map.Entry<String, String> entry : entries) {
      System.out.println(entry.getKey() + ": " + entry.getValue());
    }
  }
}
