package CurrencyDenomination;

import java.util.Scanner;

public class CurrencyCalculator {

	public void calc(int[] sorted_currencies)
	{
		int amount;
		Scanner ec = new Scanner (System.in);
		System.out.println("Enter the amount you want to pay"); 
		
		
		amount = ec.nextInt();
		//int left_over;
		//int remainder;
		int[] number_of_notes = new int[sorted_currencies.length];
		
		for(int i=0;i<sorted_currencies.length;i++)
		{
			
			if(sorted_currencies[i]<=amount)
			{
				
				number_of_notes[i]=amount/sorted_currencies[i];
				amount = amount%sorted_currencies[i];
				//amount = amount - (number_of_notes[i]*sorted_currencies[i]);
			}
			
			else
			{
				number_of_notes[i]=0;
			}
				
		}
		
		ec.close();
		
		System.out.println("The currency denomination should be ");
		for(int j=0;j<sorted_currencies.length;j++)
		{
			if(number_of_notes[j]!=0)
			{
				System.out.println(sorted_currencies[j]+" : "+number_of_notes[j]);
			}
			
			
		}
		
	}
	
	
	

}
