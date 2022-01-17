import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter your age");
      byte age = sc.nextByte();
      
        if (age >=18) {
            System.out.println("you are eligible to drive a car\n");
        }
         else {
            System.out.println("you are not eligible to drive a car\n");
        }
    }
    
}
