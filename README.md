# JavaFileHandler
This is a Java file handler I made using exsiting libraries. Just to help people easier able to understand the process of working with files.

This was orignially a Replit (online coding IDE). It's purpose is to make java file handling easier to do/understand.
The Main.java file is used as an example of how to use the FileHandler.java file.
The true or false slot is used to either append text or to completely override text previous written in a file.
In the Main.java file I use filePath as a call to the file path of the JavaTest.txt. I also use userInput() function to import user inuput into the JavaTest.txt file. For that part you can do import whateveryou want...

EX.
FileHandler.writeFile(filePath, userInput(), true); //instead of

String x = "I want icecream"; //how you could do it
FileHandler.writeFile(filePath, x, true);

Beside that, if you run it right as it comes out of the box, you can find that you have a little prompt and it show you what this program attempts to do.
