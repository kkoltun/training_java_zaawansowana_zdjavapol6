package com.sda.post.office;

public class PostOfficeApp {
  public static void main(String[] args) {
    System.out.println("Hello in the PostOfficeApp");
    System.out.println("Hello in the PostOfficeApp 2");

    Package socks = new Package("socks");

    // 1. Wyswietl wszystkie mozliwe statusy
    PackageStatus[] statuses = PackageStatus.values();
    // Wyswietl je

    // 2. Pobierz od użytkownika nazwę wybranego statusu
    String chosenStatus = "SENT";

    // 3. Stworz obiekt wybranego statusu lub wyswietl blad
    // Aby obsluzyc bledna nazwe zlap wyjatek rzucany przez valueOf
    PackageStatus newStatus = PackageStatus.valueOf(chosenStatus);
  }
}
