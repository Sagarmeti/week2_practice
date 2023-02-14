import java.util.Scanner;
class Numberofdig{
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter number to find number of digits");
    int num=s.nextInt();
    int digits=0;
    while(num!=0){
      num=num/10;
      digits++;
    }
    System.out.println("Number of digits:" +digits);
  }
}