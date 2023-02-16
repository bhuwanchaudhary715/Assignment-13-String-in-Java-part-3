package Assignments_Only;

import java.util.Scanner;

public class Third_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String number:");
        String s1=sc.nextLine();
        String s2="";

        char arrs1[]=s1.toCharArray();

        for(int i= arrs1.length-1;i>=0;i--){

            s2=s2+arrs1[i];

        }

        if(s1.equals(s2)){

            System.out.println("Given String number is a palindrome");

        }else{

            System.out.println("Given String number is not a palindrome");
        }

    }
}
