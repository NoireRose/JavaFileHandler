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

import java.io.*; // Using BufferedReader, BufferedWriter, FileReader, FileWriter, and IOException

public class FileHandler {
  
  public static void readFile(String filePath){
    BufferedReader bufferedReader = null;
    try {
      // Code that may throw an exception
      // For example, file I/O operations

      // Opens and reads file
      bufferedReader = new BufferedReader(new FileReader(filePath));
      // Outputs the file information
      String line = bufferedReader.readLine();
      // Check if information is inside of the file
      if (line == null) {
        System.out.println("The file is empty.");
        return;
      }
      else {
        System.out.println("Opening file: " + filePath);
      }
      while (line != null){
        //prints out line
        System.out.println(line);
        // Reads the next line
        line = bufferedReader.readLine();
      }
    } catch (IOException e) {
      // Code to handle the exception
      // For example, print an error message or take corrective action
      System.out.println("!!Issue READING File!!");
      e.printStackTrace();
    } finally {
      // Code that will always be executed, whether an exception occurs or not
      // For example, closing resources (files, connections, etc.)
      System.out.println("Completed Reading File: " + filePath + "\n");
    }
  }

  public static void writeFile(String filePath, String content, boolean append){
    BufferedWriter bufferedWriter = null;
    try {
      // Code that may throw an exception
      // For example, file I/O operations
      bufferedWriter = new BufferedWriter(new FileWriter(filePath, append));
      bufferedWriter.write(content);
      // Additional writing logic can be added here
      bufferedWriter.flush(); // Flush the buffer to ensure data is written
    } catch (IOException e) {
      // Code to handle the exception
      // For example, print an error message or take corrective action
      System.out.println("!!Issue WRITING File!!");
      e.printStackTrace();
    } finally {
      // Code that will always be executed, whether an exception occurs or not
      // For example, closing resources (files, connections, etc.)
      try {
        if (bufferedWriter != null) {
          bufferedWriter.close(); // Close the BufferedWriter in the finally block
        }
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (!append) {
        System.out.println("Completed Overwriting To File: " + filePath + "\n");
      } else {
        System.out.println("Completed Appending To File: " + filePath + "\n");
      }
    }
  }
}