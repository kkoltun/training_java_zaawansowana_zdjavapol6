package com.sda.strings;

public class TextDuplicate implements StringOperation {
  @Override
  public String modify(String text) {
    return text.repeat(2);
  }
}
