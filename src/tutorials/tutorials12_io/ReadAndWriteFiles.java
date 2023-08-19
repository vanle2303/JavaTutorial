package tutorials.tutorials12_io;

import java.io.*;

/**
 * This class demos the code of reading and writing a file by passing a filename.
 * This class is divided into 2 parts: read a file char by char, and read a file line by line.
 * Specific details will be shown in the methods.
 */

public class ReadAndWriteFiles {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("You forgot to enter a filename.");
            return;
        }

        try {
            //readFileCharByChar();
            readFileLineByLine(args[0]);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }

    /**
     * This method is to read a file char by char. In order to make our code more efficient, we move
     * the try-catch block to the main method, which throws the exceptions to the callers and let
     * the callers resolve them.
     * @param fileName
     * @throws IOException
     */
    private static void readFileCharByChar(String fileName) throws IOException {
        int i;
        FileInputStream fileInputStream;

        fileInputStream = new FileInputStream(fileName);

        //This block is to read the file char by char until we reach the end of file
        do {
            i = fileInputStream.read();
            if (i != -1) {
                System.out.println((char) i);
            }
        } while (i != -1);
        //i == -1 means that u've reached the end of the file

        //This clause is to close the file after opening and reading it.
        //However, if there's an exception occurring in the preceding code, the program stops right away.
        //Therefore,method close() will not be executed, which keeps the file open and wastes the memory.
        //In the next peace of code, we'll work on it and resolve this unclosed-file
        fileInputStream.close();

    }

    /**
     * This method is to read a file line by line. We would love to fix the problem of unclosing a file
     * after opening it bc of an exception occurring before method close() is executed.
     * We decide to use method close() inside finally clause, which is to let the code inside finally to
     * always be executed no matter what happens in the preceding code.
     * But finally always follows try-catch block, so we need to use try-catch here. Actually, it's acceptable
     * to only use try and discard catch.
     * This code is pretty much the same as the preceding one. But there're some changes.
     *
     * @param fileName
     * @throws IOException
     */
    private static void readFileLineByLine(String fileName) throws IOException{
        FileInputStream fileInputStream = null;
        try {
            //Since we're abt to read a file line by line not char by char, we're using String instead of int.
            String string;

            //We're using method readLine(), which belongs to class BufferedReader, so we need an object of
            //BufferedReader to call it.
            //BufferedReader takes a param of InputStreamReader so we need an object of InputStreamReader.
            //InputStreamReader takes a param of FileInputStream
            //So here are all the steps that we need to follow
            fileInputStream = new FileInputStream(fileName);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            //Here, we're using an object of BufferedReader to call method readLine()
            do {
                string = bufferedReader.readLine();
                //Note that we cannot use method equals() to compare an object with null
                //We only use equals() to compare 2 identified objects (objects != null)
                if (string != null) {
                    System.out.println(string);
                }
            } while (string != null);

            //If there're any exceptions in the preceding code, this statement will not be executed
            //Therefore, we'll use finally to resolve this prob
            fileInputStream.close();
        } catch (IOException e) {
            throw e;
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }

    /*private static void closeFile(String fileName) throws IOException {
        String string;
        FileInputStream fileInputStream = new FileInputStream(fileName);
        fileInputStream.close();
    }*/
}