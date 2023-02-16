package Assignments_Only;

import java.util.Scanner;

public class Sixth_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of String:");
        String s1= "the quick brown fox jumps over lazy dog";

        boolean flag=false;

        s1=s1.replace(" ","");

        s1=s1.toUpperCase();

        char arrs1[]=s1.toCharArray();

        int array[]=new int[26];


        for(int i=0;i<arrs1.length;i++){

            array[arrs1[i]-65]++;
        }

        for(int i=0; i< array.length;i++){

            if(array[i]==0){

                System.out.println("It is not Pangram:");
                flag=true;
            }
        }
        if(flag==false){

            System.out.println("It is a pangram:");
        }

    }
}
