package com.sda.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class OperationsApp {
  public static void main(String[] args) throws IOException {
    Path relativePath = Paths.get("io", "input.txt");

    System.out.println(Files.exists(relativePath));

    Files.createDirectories(Paths.get("nowy_folder"));
  }
}
