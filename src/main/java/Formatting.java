import java.util.Scanner;
public class Formatting {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("=========================");
       System.out.println("This program is an example for output formatting  ");
       for(int i=0;i<3;i++){
           String s1=sc.next();
           int x=sc.nextInt();
           System.out.printf("%-15s%03d%n",s1,x);
           System.out.println("=====================");
           System.out.println("Hello");
       }

       System.out.println("*=======================");
   }

}
