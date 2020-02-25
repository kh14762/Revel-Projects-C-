package csci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TestCalc {
	public static void main(String[] args) {
		int pBagels, sBagels, yy;
		String option;
		int itr = 0;
		ArrayList<String> weekList = new ArrayList<String>(
				Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday"));
		ArrayList<DailyBatchRecipe> wklyBatches = new ArrayList<>();
		Scanner input = new Scanner(System.in);
	
		System.out.print("Would you like to create a daily or weekly recipe plan?: ");
		option = input.next();
				//allows user to choose a daily or weekly recipe printout
				if (option.equals("daily")) {
					itr = 1;
					//removes day of the week header from printout
					weekList.add(0,"");
				} else if (option.equals("weekly")) {
					itr = weekList.size();	
					System.out.println();
				}
		for (int i = 0; i < itr; i++) {
			System.out.printf("%s%nPlain Bagels: ", weekList.get(i));
			pBagels = input.nextInt();
			System.out.print("Sweet Bagels: ");
			sBagels = input.nextInt();
			System.out.print("YY: ");
			yy = input.nextInt();
			System.out.println();
			wklyBatches.add(new DailyBatchRecipe(pBagels, sBagels, yy));
		}

		for (int i = 0; i < itr; i++) {
			System.out.printf("%s%n%s%n", weekList.get(i), wklyBatches.get(i).BatchCalculator());
		}
	}
}