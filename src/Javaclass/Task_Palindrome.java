package Javaclass;

import java.util.Scanner;


public class Task_Palindrome {
    
    static private String s1;
    public static boolean check(String s2)
    {   
        char ch[]=s2.toCharArray();
         int len=ch.length;
         int i=0;
                    int half=len/2;
             while(i<half)
             {
                     if(ch[i]!=ch[len-1-i])
                         return false;
                     else
                     {
                         i++;
                         continue;
                     }
                    }
                 
             
  
    return true;
        
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check Palindrome ");
        s1=sc.next();
        boolean a=check(s1);
        System.out.println("Palindrome"+" "+a);
    }
}
