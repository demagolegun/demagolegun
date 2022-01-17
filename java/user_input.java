import java.util.Scanner;

public class user_input{

    public static void main(String[]args){
        /*input:
        Scanner-here scanner is imported
        it does the work of scanning what the user is writing. and a class

        sc-its a variable in which we store a new object scanner

        new-its creating a neo object

        system.in-input function which allows us to take input from user

        sc.next()- Java Scanner next() Method. It is a Scanner class method used to 
        get the next complete token from the scanner which is in using. A complete token 
        is preceded and followed by input that matches the delimiter pattern.
        */
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");

        int a = sc.nextInt();

        System.out.println("Enter second number");

        int b = sc.nextInt();

        int sum = a+b;

        System.out.println("the sum of these two is:");

        System.out.println(sum);




    }

  

}