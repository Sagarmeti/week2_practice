import java.util.Scanner;

class weekdays{
  public static void main(String[] args){

    //creating scanner of scanner class
    Scanner sc= new Scanner(System.in);

    //declaring variables
    int number;

    //ask the user to enter values
    System.out.println("enter the number");
    number= sc.nextInt();

    if (number<1 && number>7){
      System.out.println("Invalid number");
    }
    else if(number==1)
      System.out.println("Sunday");
    else if(number==2)
      System.out.println("Monday");
    else if(number==3)
      System.out.println("Tuesday");
    else if(number==4)
      System.out.println("Wednesday");
    else if(number==5)
      System.out.println("Thursday");
    else if(number==6)
      System.out.println("Friday");
    else
      System.out.println("Saturday");

 }
}