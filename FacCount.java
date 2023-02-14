import java.util.Scanner;
class FacCount{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    int count=0;
    System.out.println("Enter number to find factors");
    int num=s.nextInt();
    for(int i=1; i<=num/2; i++){
      if(num%i==0){
        count++;
      }
    }
    System.out.println("Number of factors:" +count);
  }
}