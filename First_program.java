package Assignments_Only;

import java.util.Scanner;

public class First_program {


    public static void main(String...args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:");
          String s1 =sc.nextLine();

          String s2="";

          for(int i=0;i<s1.length();i++){

              char  s3=s1.charAt(i);

              if(s2.indexOf(s3)==-1){

                  s2=s2+s3;
              }

          }

        System.out.println("Before Removing Duplicate character:"+s1);
        System.out.println("After Removing Duplicate character:"+s2);
    }
}
