package tutorials.tutorials12_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromKeyboardDemo {
    public static void main(String[] args) {
        inputFromKeyboardAndPrint();
    }

    private static void inputFromKeyboardAndPrint() {
        //System.in is to get the input from the keyboard
        //Generally, BufferedReader wraps System.in, that is an object of BufferedReader is receiving
        //the input from the keyboard (console input)
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //Since we'll use method .readLine() to read a string entered from the key board,
        //and .readLine() may throw an exception, we have to use try-catch
        try {
            String line = "";
            //We have to use .equals() instead of "==" bc we just compare the value of line with "quit"
            //not the address
            while (line.equals("quit") == false) {
                line = bufferedReader.readLine();
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
