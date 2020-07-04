package com.sda.io;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.time.LocalDate;

public class JsonSerialization {
  public static void main(String[] args) throws JsonProcessingException {
    ObjectMapper objectMapper = new ObjectMapper();
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.configure(SerializationFeature.INDENT_OUTPUT, true);

    Person person = new Person("Karol", "Koltun", LocalDate.now(), 182);
    String json = objectMapper.writeValueAsString(person);
    System.out.println(json);

    Person jsonPerson = objectMapper.readValue(json, Person.class);
    System.out.println(jsonPerson);
  }
}
