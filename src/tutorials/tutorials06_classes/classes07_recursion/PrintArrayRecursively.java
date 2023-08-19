package tutorials.tutorials06_classes.classes07_recursion;

/**
 * Another class demos recursion, which is we call a method inside the defining method
 * There are 2 things to note abt recursion, including process(i) and recursive(i-1)
 * Be careful abt the order of these two statements
 * The 2 examples below will show how it works when we change the order of those 2 statements
 */
public class PrintArrayRecursively {
    int[] values; //just declare(khai bao) an array, no actual array is created at this step

    PrintArrayRecursively(int i) {
        //create a new array with i elements and then assign it to array "values"
        //all the elements of the array are defaulted to 0
        values = new int[i];
        for (int j = 0; j < 10; j++) {
            //assign j*10 to the element at index j
            values[j] = j * 10;
        }
    }

    void printAnArrayForward(int i) {
        if (i == 0) { //this is the stopping condition
                     // if i = 0, the method returns/stops
            return;
        }
        printAnArrayForward(i - 1); //this is a recursive call

        //after i = i-1 is executed, the ith element of the array is printed out
        //eg: pass an arg of i = 10 to the method
        //i         recursive call              own
        //10        printArray(9)              sout(9)
        //9         printArray(8)              sout(8)
        //...
        //1         printArray(0)              sout(0)
        //0         return;

        //i         recursive call
        //i=10      printArray(9)   { i = 9 -> printArray(8)
        //                                     { i = 8 -> printArray(7)
        //                                               {
        //                                                      ...
        //                                                             {i=1 -> printArray(0)
        //                                                                     {i=0 -> return}
        //                                                              }
        //                                                }
        //                                      }
        //                           }
        //
        //then it will start to print from sout(0) to sout(9), since sout(0) is the innermost statement
        System.out.println("at [" + (i - 1) + "] is " + values[i - 1]);
    }

    void printAnArrayBackward1(int i) {
        if (i == 0) { //stopping condition
            return;
        }
        //first, we print out the value at i
        System.out.println("at [" + (i - 1) + "] is " + values[i - 1]);
        //then we use recursive call to execute (i-1) and smaller
        printAnArrayBackward1(i-1);

        //this is how this statement works
        //i         sout            recursive call
        //10        sout(9)         printArray(9)
        //9         sout(8)         printArray(8)
        //...
        //1         sout(0)         printArray(0)
        //0         return;
        // it works step by step, and there's no owned statement as the function above
    }

}

class TestPrintArray {
    public static void main(String[] args) {
        PrintArrayRecursively obj = new PrintArrayRecursively(10);
        //obj.printAnArrayForward(10);
        System.out.println();
        obj.printAnArrayBackward1(10);

    }
}


