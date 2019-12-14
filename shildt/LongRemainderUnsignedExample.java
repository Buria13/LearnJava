package shildt;

import java.util.Scanner;

/*
 * This example source code demonstrates the use of
 * remainderUnsigned(long dividend, long divisor) method of Long class
 */

public class LongRemainderUnsignedExample {

    public static void main(String[] args) {

        // Ask for user input
        System.out.print("Enter the dividend:");

        // declare a scanner object to read the user input
        Scanner s = new Scanner(System.in);

        // assign the input to a variable
        Long dividend = s.nextLong();


        // Ask for another value
        System.out.print("Enter the divisor:");
        Long divisor = s.nextLong();

        // get the remainder (unsigned)
        long result = Long.remainderUnsigned(dividend, divisor);

        // print the result
        System.out.println("Remainder:"+result);

        // close the scanner object
        s.close();
    }

}

