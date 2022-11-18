import java.util.*;
import java.lang.Math;
class quadratic{
public static void main(String[] args)
{
Scanner sc=new Scanner (System.in);
double r1;
double r2;
System.out.println("enter the value of a b c ");
int a=sc.nextInt();
System.out.println("a is "+a);
int b=sc.nextInt();
System.out.println("b is"+b);
int c=sc.nextInt();
System.out.println("c is"+c);
int d=(b*b)-(4*a*c);
System.out.println("d is"+d);
if(d>0)
{
System.out.println("roots are real and distinict");
r1=(-b+Math.sqrt(d)/(2*a));
r2=(-b-Math.sqrt(d)/(2*a));
System.out.println("the roots are" +r1+"and" +r2);
}
else if(d==0)
{
System.out.println("roots are real and equal");
r1=r2=(-b)/(2*a);
System.out.println("the roots are"+r1+"and"+r2);
}
else 
{
System.out.println("roots are imaginary");
r1=-b/(2*a);
r2=(Math.sqrt(Math.abs(d)))/(2*a);
System.out.println("r1="+r1+"+i"+r2);
System.out.println("r2="+r1+"-i"+r2);
}
}
}