import java.util.Scanner;
class Age{
  public static void main(final String args[]){
    final Scanner s=new Scanner(System.in);
    System.out.println("Enter the DOY");
    int DOB;
    int b=0;
    DOB=s.nextInt();
    
    b=2023-DOB;
  if(b>18)
   System.out.println("age is" +b);
    {
   System.out.println("Minor");
    }
  
  }
}