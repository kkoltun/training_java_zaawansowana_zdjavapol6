package com.sda.io;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class SerializationApp {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    try (FileOutputStream fos = new FileOutputStream("io/people.bin");
         ObjectOutput objectOutput = new ObjectOutputStream(fos);
         FileInputStream fis = new FileInputStream("io/people.bin");
         ObjectInput objectInput = new ObjectInputStream(fis)) {

      Person person1 = new Person("Karol", "Koltun", LocalDate.now(), 182);
      Person person2 = new Person("Wiktoria", "Kowalska", LocalDate.now(), 180);

      List<Person> people = List.of(person1, person2);
      objectOutput.writeObject(people);

      Object object = objectInput.readObject();
      List<Person> inputPeople = (List<Person>) object;
      System.out.println(inputPeople);
    }
  }
}
