
package Javaclass;


import java.util.Scanner;



public class Taskcount {
private static int countchar;  
private static int countsyb;
private static int countdigi;
private static int countspace;
    public static void main(String[] args) {
        int castascii;
        
        Scanner sc=new Scanner(System.in);
        
       System.out.println("Enter the string ");
       String s1=sc.next();
               int len=s1.length();
               System.out.println(s1);
       char ch[]= s1.toCharArray();
    
        for (int i = 0; i < len; i++) {
            castascii=(int)ch[i];
            System.out.println(castascii);
           if(castascii>=65&&castascii<=90||castascii>=97&&castascii<=122)
           {
               countchar++;
           }
           else
           
               if(castascii>=48&&castascii<=57)
               {
                   countdigi++;
               }
//           else
//               if(castascii==32)
//               {
//                   countspace++;
//               }
           else
               {
                   countsyb++;
               }
           
            
        }
        System.out.println("No. of characters are "+" "+countchar);
        System.out.println("No. of Digits are "+" "+countdigi);
        System.out.println("No. of Space are "+" "+countspace);
        System.out.println("No. of Symbol are "+" "+countsyb);
    }
}
