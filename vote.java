import java.util.Scanner;

class vote{
  public static void main(String[] args){

    Scanner sc =new Scanner(System.in);

    int age;
    System.out.println("enter age:");
    age=sc.nextInt();

    if(age>=18)
      System.out.println("eligible to vote");
      else
      System.out.println("not eligible to vote");
  
  }
}