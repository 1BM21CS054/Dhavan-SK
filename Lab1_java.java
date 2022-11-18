import java.util.Scanner;
import java.lang.Math;
public class Quadratic {
public static void main (String args[]){
float a, b, c, d;
double root1, root2;
Scanner s = new Scanner(System.in);
System.out.println("Enter coefficients:");
a=s.nextFloat();
b=s.nextFloat();
c=s.nextFloat();
d=(b*b-(4*a*c));
if(a==0){
System.out.println("Not a quadratic equation");
}

else if (d>0){
root1=(-b+Math.sqrt(d))/(4*a*c);
root2=(-b-Math.sqrt(d))/(4*a*c);
root1=(-b+Math.sqrt(d))/(2*a);
root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("Real and distinct roots are:"+root1+" and "+root2);
}
else if(d<0){
root1=-b/(2*a);
root2=d/(2*a);
System.out.println("Imaginary roots and distinct are:"+root1+"+i"+root2+" and "+root1+"-i"+root2);
}
else if(d==0){
root1=root2=-b/(2*a);
System.out.println("Real roots are:"+root1+"and"+root2);
}
}
}
