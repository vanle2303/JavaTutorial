package tutorials.tutorials12_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadCharacters {
    public static void main(String[] args) {
        char c;
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        //The whole thing up there equals the statement below
        /*BufferedReader bufferedReaders = new BufferedReader(new InputStreamReader(System.in));*/

        System.out.println("Enter 'q' to quit.");

        try {
            do {
                //When method .read() is called, it reads the characters from the input stream and returns
                //integer number. Therefore, we have to cast those integer value to type char by the syntax
                //below.
                //Since .read() may throw an exception, we have to use try-catch block
                c = (char) bufferedReader.read();
                System.out.println(c);
            } while (c != 'q');
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
