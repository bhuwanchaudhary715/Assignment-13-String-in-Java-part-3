package Assignments_Only;

import java.util.Arrays;
import java.util.Scanner;

public class Fifth_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of String s1:");
        String s1=sc.nextLine();

        System.out.println("Enter the value of String s2:");
        String s2=sc.nextLine();

        s1=s1.replace(" ","");
        s2=s2.replace(" ","");

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        char [] arrs1=s1.toCharArray();
        char [] arrs2=s2.toCharArray();

        Arrays.sort(arrs1);
        Arrays.sort(arrs2);

        System.out.println(arrs1);
        System.out.println(arrs2);

        if(Arrays.equals(arrs1,arrs2)){

            System.out.println(" Given String value is Anagram:");

        }else{

            System.out.println("Given String value is not a Anagram:");
        }
    }
}
