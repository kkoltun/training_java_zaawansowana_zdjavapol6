package com.sda.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Consumer;

import static java.nio.charset.StandardCharsets.UTF_8;
import static java.nio.file.Files.newBufferedReader;

public class FileOperationsApp {
  public static void main(String[] args) throws IOException {
    try (BufferedReader reader = newBufferedReader(Paths.get("io", "input.txt"), UTF_8)) {
      Consumer<String> printer = line -> {
        System.out.println(line);
      };

      reader.lines().forEach(printer);
    }
  }

  private static void readFileToByteArray() throws IOException {
    try (FileInputStream fileInputStream = new FileInputStream("io/input.txt")) {
      byte[] bytes = fileInputStream.readAllBytes();

      String text = new String(bytes, UTF_8);
      System.out.println(text);
    }
  }

  private static void readFileTryWithResources() throws IOException {
    try (FileInputStream fileInputStream = new FileInputStream("io/input.txt")) {
      int read = fileInputStream.read();

      while (read != -1) {
        char character = (char) read;
        System.out.print(character);

        read = fileInputStream.read();
      }
      System.out.println("\nKoniec pliku!");
    }
  }

  private static void readFileTryCatchFinally() throws IOException {
    FileInputStream fileInputStream = null;
    try {
      fileInputStream = new FileInputStream("io/input.txt");
      int read = fileInputStream.read();

      while (read != -1) {
        char character = (char) read;
        System.out.print(character);

        read = fileInputStream.read();
      }
      System.out.println("Koniec pliku!");

    } catch (IOException exception) {
      System.err.println(exception.getMessage());

    } finally {
      if (fileInputStream != null) {
        fileInputStream.close();
      }
    }
  }
}
