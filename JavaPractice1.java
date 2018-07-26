import java.util.Scanner;
//Imports the Java Scanner package

public class JavaPractice1 {
    // Public means that the method or variable can be accessed by elements in other classes
    public static void main(String[] args) {
            // static helps the main method get loaded first without making an object of it
            // void means that the main method will not return a value
            // main is the name of the method, and where the program starts its execution
            // String []args defines the String array to pass argunents. args is the
            // variable name of the String Array. It does not have to be args
            // You can have it say String[] a for example. This is the first method you
            // learn in Java, very important to know
        Scanner input = new Scanner(System.in);
            // Scanner is used to obtain an input from int, double, etc.
            // Simplest way to get an input, but may not be the most efficient
        System.out.print("Input the first number: ");
            // prints out a scentence
        int num1 = input.nextInt();
            // the first input. nextInt is a method of the object of the scanner class
            // input.nextInt will take the integer that is inputed by the user and use it as our num1
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
            // Same as above
        int sum = num1 + num2;
            // Adds the two numers together to create our sum
        System.out.println();
            // Adds a blank line
        System.out.println("Sum: " + sum);
            // The system prints out our sum
    }
}