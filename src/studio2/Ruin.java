package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Start Amount");
		double startAmount = in.nextDouble();
		System.out.println("Total Simulations");
		int totalSimulations = in.nextInt();
		System.out.println("Win Chance");
		double winChance = in.nextDouble();
		System.out.println("Win Limit");
		double winLimit = in.nextDouble();
		
		for (int i = 1; i <= totalSimulations; i++) {
			double amount= startAmount;
			int dailyPlays = 0;
			while ((amount > 0) && (amount < winLimit)) {
				double chance= Math.random();
				if ( chance < winChance) {
					amount += 1;
					dailyPlays += 1;
				} else {
					amount -= 1;
					dailyPlays += 1;
				}

			}
			
			if (amount==0) {
				System.out.println("Simulation " + i + " : "+ dailyPlays +" LOSE");
			}
			if (amount== winLimit) {
				System.out.println("Simulation " + i + " : "+ dailyPlays +" WIN");
			}

		}

	}
}
