import java.util.Scanner;
class Usernum{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter stop value:");
    int stop=s.nextInt();
    for(int i=1; i<=stop;i++){
      System.out.println(i);
    }
  }
}