package edu.cnm.deepdive;

/*
You want to create secret messages which can be deciphered by the Decipher this!
kata. Here are the conditions:
Your message is a string containing space separated words.
You need to encrypt each word in the message using the following rules:
The first letter needs to be converted to its ASCII code.
The second letter needs to be switched with the last letter
Keepin' it simple: There are no special characters in input.

 */

public class EncryptThis {

  public static String encryptThis(String text) {

    String encrypted = "";
    if (text.length() == 0) {
      return "";
    }
    String[] words = text.split("\\s+");
    for (int i = 0; i < words.length - 1; i++) {

      words[i] = words[i].replaceAll("[^\\w]", "");
    }

    for (int j = 0; j < words.length; ++j) {

      char[] splitWord = words[j].toCharArray();
      char c = splitWord[0];
      int ascii = (int) c;
      if (splitWord.length == 1 && j == words.length - 1) {
        encrypted += "" + ascii;
      } else if (splitWord.length == 1) {
        encrypted += "" + ascii + " ";
      } else if (splitWord.length == 2 && j == words.length - 1) {
        encrypted += "" + ascii + splitWord[1];
      } else if (splitWord.length == 2) {
        encrypted += "" + ascii + splitWord[1] + " ";

      } else if (splitWord.length == 3 && j == words.length - 1) {
        encrypted += "" + ascii + splitWord[2] + splitWord[1];
      } else if (splitWord.length == 3) {
        encrypted += "" + ascii + splitWord[2] + splitWord[1] + " ";
      } else if (splitWord.length == 4 && j == words.length - 1) {
        encrypted +=
            "" + ascii + splitWord[splitWord.length - 1] + splitWord[2]
                + splitWord[1];
      } else if (splitWord.length == 4) {
        encrypted +=
            "" + ascii + splitWord[splitWord.length - 1] + splitWord[2]
                + splitWord[1] + " ";
      } else if (splitWord.length > 4 && j == words.length - 1) {
        encrypted += "" + ascii + splitWord[splitWord.length - 1] + (words[j]
            .substring(2, splitWord.length - 1)) + splitWord[1];
      } else if (splitWord.length>4){
        encrypted += "" + ascii + splitWord[splitWord.length - 1] + (words[j]
            .substring(2, splitWord.length - 1)) + splitWord[1] + " ";
      }

    }

    return encrypted;
  }

}
