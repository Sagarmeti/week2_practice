import java.util.Scanner;

 

class Employee{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int tax = 0, netsalary = 0;

 

    System.out.println("Enter the  Monthly Salary ");
    int salary = s.nextInt();
    int ansalary = 0;
    ansalary = salary * 12;
    System.out.println("Annual Salary is" + ansalary);

 

    if (ansalary <= 700000) {
      System.out.println("No Tax");
    }
    else if(ansalary>=700000){
    if ((ansalary - 300000 >= 300000) && (ansalary - 300000 <= 60000)) {
      {
        tax = (ansalary * 5) / 100;
      }
      if ((ansalary - 600000 >= 600000) && (ansalary - 600000 <= 90000)) {
        tax = (300000 * 5) / 100 + (ansalary - 600000) * 10 / 100;
      }
      if ((ansalary - 900000 >= 900000) && (ansalary - 900000 <= 120000)) {
        tax = (300000 * 5) / 100 + (300000 * 10) / 100 + (ansalary - 900000) * 15 / 100;
      }
    } else {
      tax = (300000 * 5) / 100 + (300000 * 10) / 100 + (300000 * 15) / 100 + (ansalary - 1200000) * 20 / 100;
    }
    }
    System.out.println("Tax amount is" + tax);
    netsalary = ansalary-tax;
    System.out.println("Net salary is" + netsalary);
  }
}