package Javaclass;

import java.util.Scanner;


public class Task2 
{
  
  static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
         String s1=new String();
    
  System.out.println("Enter a Email");
  s1=sc.next();
  if(s1.endsWith("@gmail.com"))
            System.err.println("Google Account");
  else
      if(s1.endsWith("@yahoo.com"))
        System.err.println("Yahoo Account");
  else
     if(s1.endsWith("@outlook.com"))
            System.err.println("Microsoft Account");
     else 
         if(s1.endsWith("@rediff.com"))
             System.err.println("Rediff Mail Account");
  }
}