package Javaclass;

import java.util.Scanner;


public class Task1 {
    Scanner sc=new Scanner(System.in);
private String s1[]={"bhopal","agra","mumbai","chennai","pune","delhi"};
public int count=0;

int le(){
    return s1.length;
}
void sort(int x){
    String temp;
    
   count=0;
    int i=s1[x].compareToIgnoreCase(s1[x+1]);
    if(i>0){
        count++;
       temp=s1[x];
       s1[x]=s1[x+1];
       s1[x+1]=temp;
    }
}

    void show() {
        for(int i=0;i<s1.length;i++)
       System.out.println(s1[i]);
    }

}
    
    

