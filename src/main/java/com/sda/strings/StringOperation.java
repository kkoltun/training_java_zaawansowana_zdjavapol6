package com.sda.strings;

public interface StringOperation {
  String modify(String text);

  default String modifyTwice(String text) {
    return modify(modify(text));
  }
}
