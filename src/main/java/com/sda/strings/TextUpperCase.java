package com.sda.strings;

public class TextUpperCase implements StringOperation {
  @Override
  public String modify(String text) {
    return text.toUpperCase();
  }
}
