import java.util.Scanner;
class Ebill{
  public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    
    int Units,gst;	
		double Total_Amount;
		
		System.out.print(" Please Enter the Units that you Consumed  : ");
		Units = s.nextInt();
  
		Total_Amount = ElectricityBill(Units);
		System.out.println("\n Electricity Bill  =  " + Total_Amount);
	}
	public static double ElectricityBill(int Units)
	{
		double Amount, gst, Total_Amount;
		if (Units < 50)
	  	{
	        Amount = 0.50 / Units;
	  		gst = 20%;  	
	  	} 
	  	else if (Units <= 100)
	  	{
	  		Amount = 1.23/unit;
	  		gst = 20%; 	
	  	}
	  	else if (Units <= 250)
	  	{
	  		Amount = 2.34/unit;
	  		gst = 20%; 	
	  	}
	  	else if (Units >= 250)
	  	{
		   	Amount = 3.45 / unit; 
		   	gst = 20%; 
		}
		
	
	
	}
}