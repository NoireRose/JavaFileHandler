/**
 * FileHandler - A Java program for reading and writing files.
 * 
 * Author: Malachi Hanson
 * GitHub: Don't have one (text prompt by chatGpt, lul)
 * lul - Laugh Up Loud
 *
 *
 * Special thanks to ChatGPT by OpenAI for assistance.
 * 
 * Date: 1/7/2024
 */

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String filePath = "JavaTest.txt";
    FileHandler.readFile(filePath);
    // Not overwrite EX.
    System.out.println("Enter a single line response:");
    FileHandler.writeFile(filePath, userInput(), true);
    FileHandler.readFile(filePath);

    String content = "How are you?\nHow old are you?\nDo you like chocolate? (you better)\n";
    // Overwrite EX. (This returns it back to original)
    //FileHandler.writeFile(filePath, content, false);
    //FileHandler.readFile(filePath);
  }

  public static String userInput(){
    Scanner s = new Scanner(System.in);
    return s.nextLine() + "\n";
  }
}
