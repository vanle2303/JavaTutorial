package tutorials.tutorials12_io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * This class is to copy a file and write it to a destination file by using method .write()
 * There are 2 types of copy a file:
 *      1. Delete all the existing info of the destination file and then write the copied info of the copied file
 *      into that destination file
 *      2. Write the copied info into the end of the destination file. In this case, we use this constructor
 *      public FileOutputStream(String name, boolean append), if append is true, then the info will be written
 *      in the end of the destination file
 *
 * NOTE:
 *      1. When executing this program, we must create a new destination file in order to not lose the existing info
 *      of the destination file. For example, running this program, we created a new file /Users/vanle/.myownconfig
 *      2. When passing the filenames to the param, there are NO comas between param list
 *
 * In this class, we also upgrade our program by using a syntax to automatically close a file.
 * Specifically, instead of declaring objects separately outside, we put those declarations inside parenthesis right
 * after try like the code below. So the files declared inside those parenthesis will be automatically closed
 * no matter what. Therefore, we can remove the `finally` block in the end of this code.
 */

public class CopyAFile {
    public static void main(String[] args) {
        copyAFileToAnotherFile(args);
    }

    private static void copyAFileToAnotherFile(String[] args) {
        int i;
        /*FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;*/

        if (args.length != 2) {
            System.out.println("You need to enter 2 filenames.");
            return;
        }

        try(FileInputStream fileInputStream = new FileInputStream(args[0]);
            FileOutputStream fileOutputStream = new FileOutputStream(args[1])) {

            do {
                i = fileInputStream.read();
                if (i != -1) {
                    fileOutputStream.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } /*finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the input file.");
            }

            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the output file.");
            }*/
    }
}
