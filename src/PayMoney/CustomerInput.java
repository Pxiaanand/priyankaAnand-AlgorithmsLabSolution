package PayMoney;
import java.util.Scanner;

public class CustomerInput {

	public void PayMoney() {
		Scanner sc = new Scanner(System.in);
		int size = 0; //array size
		System.out.println("Enter the size of the transcation array");
		size = sc.nextInt();
		int [] moneyArray = new int [size];
		boolean achievedFlag = false; //Target check, if the target is completed or not
		int transactions = 1;
		int target, i;
		int tarsize = 0; 
		
		System.out.println("Enter the values of the array");
		//getting the values from the user
		for(i=0; i<size; i++){
			moneyArray[i] = sc.nextInt();
			if (moneyArray[i]==0){
				System.out.println("Enter a value greater than 0");
				i--;
			}	
		}
		System.out.println("Verify the values you have entered");
		for(i=0; i<size; i++){
			System.out.print(" " + moneyArray[i]);
			}
		
		System.out.println("\nEnter the number of targets you want to achieve today");
		tarsize = sc.nextInt();
		//Loop for running the check for each target value depending on the number of values to check
		
		for (i=0; i<tarsize; i++) {
			System.out.println("Enter the value of the target");
			target = sc.nextInt();
			if (target <= moneyArray[0]) {
				System.out.println("Your target has been achieved, Transactions = 1");
				achievedFlag = true;
			}
			else {
				int sum = moneyArray[0];
				for (int j=1;j<size; j++) {
					sum+=moneyArray[j]; //incrementing the value of sum by adding each element of the array
					transactions++;
					if (target<=sum) {
						System.out.println("Your target has been achieved, Transactions =" + transactions);
						achievedFlag = true;
						break;
					}				
								
				}
				
			}
		}
	if(achievedFlag==false) {
		System.out.println("Your target cannot be achieved");
	}
	sc.close();
	}
		
}
	