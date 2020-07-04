package com.sda.strings;

public class LambdaStringOperation {
  public static void main(String[] args) {

    StringOperation modifyAdd = text -> text.concat(" ADD");
    StringOperation toUpperCase = String::toUpperCase;
    StringOperation myModify = LambdaStringOperation::myModifyText;

    System.out.println(toUpperCase.modify("karol"));
    System.out.println(myModify.modify("karol"));
  }

  private static String myModifyText(String text) {
    return text + " MODIFICATION";
  }
}
