import java.util.*;
class Day18{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("enter value a  :");
double a=sc.nextDouble();
System.out.print("enter value b :");
double b=sc.nextDouble();
System.out.print("enter value c :");
double c=sc.nextDouble();
double discriminant=(b*b-4.0*a*c);
if(discriminant>0.0){
double root1=(-b+Math.sqrt(discriminant))/(2.0*a);
double root2=(-b-Math.sqrt(discriminant))/(2.0*a);
System.out.print("the roots are"+root1+"and"+root2);
}
else if(discriminant==0.0){
double root=(-b/(2.0*a));
System.out.print("the root is "+root);
 }
else{
System.out.print("roots are not real");
}
}
}