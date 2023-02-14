import java.util.Scanner;
class Prime{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    int count=0;
    System.out.println("Enter number to check it is prime or not");
    int num=s.nextInt();
    for(int i=1; i<=num/2; i++){
      if(num%i==0){
        count++;
      }
    }
    if(count==1){
      System.out.println("Number is prime");
    }
    else{
      System.out.println("Number is not prime");
    }
  }
}