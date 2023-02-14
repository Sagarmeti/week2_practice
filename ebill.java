import java.util.Scanner;

class ebill{
  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);

    //declaring variables
    float unit;
    float bill;

    System.out.println("Enter the number:");
    unit=sc.nextInt();

    if(unit<=50){
      bill=unit*0.50f;
    }else if(unit>50 && unit<=150){
      bill=unit*1.23f;
    }else if(unit>150 && unit<=250){
      bill=unit*1.90f;
    }else{
      bill=unit*2.34f;
    }

    System.out.println("bill is:" +bill);
  }
}