import java.util.*;
class Day11
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter first number:");
int n1=sc.nextInt();
System.out.println("enter second number:");
int n2=sc.nextInt();
int max=(n1>n2)?n1:n2;
System.out.println("Maximum is ="+(max));
}
}