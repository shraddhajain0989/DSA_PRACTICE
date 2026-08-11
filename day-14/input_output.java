// in this code i learn about how to take input from user and how to print output in java

import java.util.Scanner;
public class input_output{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        sc.close();
    }
}