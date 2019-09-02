
package Javaclass;

import java.util.Scanner;

public class Task_Palindrome1 {
 
    private static StringBuffer s1=new StringBuffer();
    public static boolean check(StringBuffer s2)
    {  StringBuffer s3=new StringBuffer(s2);
       String s5= s2.toString();
       s3.reverse();
        
       String s4= s3.toString();
       //System.out.println(""+s3);
       int a=s5.compareTo(s4);
        
        if(a==0)
              return true;
        else 
            return false;            
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check Palindrome ");
        s1.insert(0,sc.next());
       // System.out.println(s1);
        boolean a=check(s1);
        System.out.println("Palindrome"+" "+a);
    }    
}
