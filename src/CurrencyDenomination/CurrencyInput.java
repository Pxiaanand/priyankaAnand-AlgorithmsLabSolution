package CurrencyDenomination;
import java.util.Scanner;

public class CurrencyInput {
	
	public int[] Denomination() { 
		Scanner sc = new Scanner (System.in);
		int size = 0;
		System.out.println("Enter the size of the currency denomination array");
		size = sc.nextInt();
		int[] currency = new int [size];
		int start = 0;
		int end = size-1 ;		
		System.out.println("Enter your currency values"); 
		for(int i=0; i<size; i++){
			currency[i] = sc.nextInt();
			if (currency[i]==0){ //ensuring that the values are greater than zero
				System.out.println("Enter a value greater than 0, this value cannot be accepted");
				i--;
			}	
		
		}
		//Sorting the Array
		int[] sorted_currencies=quicksort(currency,start,end);
		
		/*System.out.println("Verify the Sorted Array");
		for(int i=0; i<size; i++){
			System.out.print(" " + sorted_currencies[i]);
			}*/
		
		//sc.close();	
		return(sorted_currencies);
				
	}
		
	int partition (int a[], int start, int end)  
	{  
	    int pivot = a[end]; // pivot element  
	    int index = (start - 1);  
	  
	    for (int j = start; j <= end - 1; j++)  
	    {  
	        if (a[j] > pivot)  
	        {  
	            index++; // increment index of smaller element  
	            int temp = a[index];
	            a[index] = a[j];
	            a[j] = temp;
	        }  
	    }  
	    
	    int t = a[index+1];  
	    a[index+1] = a[end];  
	    a[end] = t;  
	   
	    return (index + 1);  
	}  
	
	int[] quicksort(int a[], int start, int end) // a[] = array to be sorted, start = Starting index, end = Ending index */  
	{  
	    if (start < end)  
	    {  
	        int p = partition(a, start, end); 
	        a=quicksort(a, start, p - 1);  
	        a=quicksort(a, p + 1, end);  
	    }  
	    
	    return a;
	}  

}
