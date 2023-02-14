import java.util.Scanner;
class operations{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
      int a, b;
    System.out.println("Enter two values");
    a= s.nextInt();
    b= s.nextInt();

    //sum of two numbers
    System.out.println("sum is:" +(a+b));

    //substraction of two numbers
    System.out.println("substraction is:" +(a-b));

    //multiplication of two numbers
    System.out.println("multiplication is:" +(a*b));

    //division of two numbers
    System.out.println("division is:" +(a/b));
  }
}