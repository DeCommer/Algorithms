package com.decommer.algorithms;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DaysAboveAvgTemp {
    
    	public static void daysAboveAvgTemp() {
		DecimalFormat df = new DecimalFormat("#.00"); 
		Scanner in = new Scanner(System.in);
		System.out.print("How many days' temps: ");
		int day = in.nextInt();
		int[] temps = new int[day];
		int sum = 0;
		for(int i = 0; i < day; i++) {
			System.out.printf("Day %d's high temp: ", (i + 1));
			temps[i] = in.nextInt();
			sum += temps[i];
		}
		double avg = sum / day;
		int daysAboveAvg = 0;
		for(int i = 0; i < temps.length; i++) {
			if(temps[i] > avg) {
				daysAboveAvg++;
			}
		}
		System.out.println();
		System.out.printf("The average temp over %d days is: %s", day, df.format(avg));
		System.out.println();
		System.out.printf("days above the average temperature: %d", daysAboveAvg);
		in.close();
	}
}
