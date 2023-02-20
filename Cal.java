import java.util.Scanner;
class Cal {
   public static void main(String args[]) {
     Scanner s = new Scanner(System.in);
     int number1,number2;
      System.out.println("Enter the number1:");
  number1=s.nextInt();
      System.out.println("Enter the number2:");
  number2=s.nextInt();
      System.out.println("Enter the operator:+,-,*,/");
     char ch=s.next().charAt(0);
     if (ch== '+')
     {
       System.out.println(number1+number2);
     }
     else if(ch== '-'){
       System.out.println(number1-number2);
     }
     else if(ch== '*'){
       System.out.println(number1*number2);
     }
     else if(ch== '/'){
       System.out.println(number1/number2);
     }
   }
  
}