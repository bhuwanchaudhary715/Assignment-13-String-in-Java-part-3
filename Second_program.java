package Assignments_Only;

import java.util.Scanner;

public class Second_program {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:");
        String s1 = sc.nextLine();

        String s2="";
        String s3="";

        for(int i=0;i<s1.length();i++){

            char  s4=s1.charAt(i);

            if( s2.indexOf(s4)==-1){

                s2=s2+s4;

            }else {

                s3=s3+s4;
            }

        }

        System.out.println("Before Removing Duplicate character:"+s1);
        System.out.println("After Removing Duplicate character:"+s3);

    }
}
