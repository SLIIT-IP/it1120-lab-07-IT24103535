import java.util.Scanner;

public class IT24103535Lab7Q1A{
public static void main(String[] args){

double mark1, mark2, mark3, mark4, average;
String distinction, credit, fail;

Scanner input=new Scanner(System.in);

System.out.println("Enter marks for four subjects:");

System.out.print("Enter subject Mark 1: " );
mark1=input.nextDouble();

System.out.print("Enter subject Mark 2: " );
mark2=input.nextDouble();

System.out.print("Enter subject Mark 3: ");
mark3=input.nextDouble();

System.out.print("Enter subject Mark 4: ");
mark4=input.nextDouble();

average = (mark1+ mark2+ mark3+ mark4)/4.0;

System.out.println();
System.out.println("Average is : " + average);

if(100<=average || average>=75){
    System.out.print("Overall Grade is : Distinction");
}
else if (74<=average || average>=50){
    System.out.print("Overall Grade is : Credit");
}
else{
    System.out.print("Overall Grade is : Fail ");
}
}
}