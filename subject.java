import java.util.Scanner;

class subject{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //declaring variables
    int sub1=0, sub2=0, sub3=0, total=0, avg=0;

    System.out.println("Enter 3 subject marks:");
    sub1= sc.nextInt();
    sub2= sc.nextInt();
    sub3= sc.nextInt();

    total= sub1+sub2+sub3;

    avg=total/3;
    System.out.println("Total marks:" +total);
    System.out.println("average marks" +avg);
  }
}