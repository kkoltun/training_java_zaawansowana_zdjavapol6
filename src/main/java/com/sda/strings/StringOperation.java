package com.sda.strings;

@FunctionalInterface
public interface StringOperation {
  String modify(String text);

  default String modifyTwice(String text) {
    String modifiedOnce = modify(text);
    return modify(modifiedOnce);
  }
}
