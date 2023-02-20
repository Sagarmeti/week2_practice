import java.util.Scanner;	

class Example1  {

	public static void main(String args[]) {
	  Scanner s = new Scanner(System.in); 
	  System.out.println("Digits Sum and Product");
	  System.out.print("Enter Number: ");
	  int num = s.nextInt();
	  int remainder, temp, sum=0, product=1,diff;
	  temp = num;
	  while (temp!=0){
		  remainder = temp % 10;
		  sum = sum + remainder;
		  product = product * remainder;
		  temp = temp / 10;
	  }
    diff=product-sum;
    System.out.println("Difference between sum and product in digits in a given number" +diff);
	}
 } 