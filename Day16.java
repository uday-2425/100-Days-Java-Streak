import java.util.*;
class Day16
{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter age :");
int age=sc.nextInt();
if(age>=18){
System.out.print("eligible");
}
if(age<18){
System.out.print(" not eligible");
}
}
} 