package oops;
import java.util.Scanner;
public class calculator {
	
	static int powerInt(int num1,int num2) {
		   return (int)Math.pow(num1, num2);

		 }
		  static double powerDouble(double num1,double num2) {
		   return Math.pow(num1, num2);
		 } 

		  public static void main(String[] args) {
		         Scanner sc = new Scanner(System.in);
		         int intBase = sc.nextInt();
		         int intExp = sc.nextInt();
		         int intResult = powerInt(intBase, intExp);
		         System.out.println(intResult);
		         double doubleBase = sc.nextDouble();
		         int doubleExp = sc.nextInt();
		         double doubleResult = powerDouble(doubleBase, doubleExp);
		         System.out.println(doubleResult);
		     }
		 }


