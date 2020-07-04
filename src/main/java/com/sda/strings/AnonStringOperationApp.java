package com.sda.strings;

public class AnonStringOperationApp {
  public static void main(String[] args) {
    StringOperation truncateText = new StringOperation() {
      private static final int LENGTH = 4;
      @Override
      public String modify(String text) {
        if (text.length() < LENGTH + 1) {
          return  text;
        }
        return text.substring(0, LENGTH);
      }
    };

    StringOperation modifyText = new StringOperation() {
      private static final String TEXT = "Modified: ";

      @Override
      public String modify(String text) {
        return TEXT + text;
      }
    };

    System.out.println(truncateText.modify("alan"));
    System.out.println(truncateText.modify("karol koltun"));
    System.out.println(modifyText.modify("alan"));
  }
}
