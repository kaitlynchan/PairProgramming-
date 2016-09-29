import java.util.*;
public class PairProgramming {
	public static void main (String[] args){
		Scanner userInput = new Scanner (System.in);
		int evenMax = 0;
		int min = 0;
		int max = 0;
		int evenTotal = 0;
		System.out.println("How many loops do you want?");
		int loops = userInput.nextInt();
		for (int number = loops; number <= loops; number++){
			System.out.println("enter in next number");
			int nextNumber = userInput.nextInt();
			if (nextNumber > max){
				max = nextNumber;
			}
			else{
				min = nextNumber;
			}
			if (nextNumber % 2 == 0){
				evenTotal += nextNumber;
				if(nextNumber > evenMax){
					evenMax = nextNumber;
				}
			}
			
		}
		System.out.println(evenTotal);
	}
	

}
