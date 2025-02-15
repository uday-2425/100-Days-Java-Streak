import java.util.*;
class Day13{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter first number:");
int a=sc.nextInt();
System.out.print("enter second number:");
int b=sc.nextInt();
System.out.print("enter second number:");
int c=sc.nextInt();
int max=(a>b)?a:b;
int largest=(max>c)?max:c;
System.out.println("maximum is ="+largest);

}
}