package com.sda.strings;

public class StringOperationApp {
  public static void main(String[] args) {
    printModification("karol", new TextUpperCase());
    printModification("karol", new TextDuplicate());
  }

  public static void printModification(String text, StringOperation operation) {
    String modified = operation.modify(text);
    String message = String.format("Before: [%s]; after: [%s].",
        text,
        modified);
    System.out.println(message);
  }
}
