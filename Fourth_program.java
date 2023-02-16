package Assignments_Only;

import java.util.Scanner;

public class Fourth_program {

    public static void main(String[] args) {

          Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of String:");
        String s1=sc.nextLine();

        String s2="AEIOUaeiou";

        int consonants=0;
        int vowels=0;
        int specialChar=0;

          for(int i=0;i<s1.length();i++){

              char c1=s1.charAt(i);

              if(Character.isLetter(c1)){

                  if(s2.indexOf(c1)!=-1){

                      vowels++;  // vowels=vowels+1;

                  } else {

                      consonants++;  // consonants=consonants+1;
                  }

              } else {

                  specialChar++;
              }
          }

        System.out.println("The vowels letters is: "+vowels);
        System.out.println("The consonants letters is: "+consonants);
        System.out.println("The specialCharacters letters is: "+specialChar);
    }
}
