package Javaclass;


public class Taskcountjava {
    public static void main(String[] args) {
        String s1="this is java and java is powerful, java is object oriented";
        String s[]=s1.split(s1);
        int count=0;
        int c=0;
        int j;
        int i=0;
       
        j = s1.lastIndexOf("java");
        System.out.println(""+j);
        i=0;
        while(i<j)
        { c=0;
          c=s1.indexOf("java",i);
          i=c;
          if(c>0)
              count++;
          i++;
        }
       
                System.out.println(" "+count);
    
}
}
