package Assignments_Only;

import java.util.Scanner;

public class Seventh_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of String:");
        String s1=sc.nextLine();
        String s2="";


        for(int i=0;i<s1.length();i++){

            char s3=s1.charAt(i);

            if(s2.indexOf(s3)==-1){

               s2=s2+s3;
            }
        }
        if(s1.equals(s2)){

            System.out.println("It is unique character:");

        }else{

            System.out.println("Its is not unique character:");
        }

    }
}
