import java.util.Scanner;
public class GetMonthlyTemperatures {
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		float[] avTemps = new float[12];
		float min = 0;
		float max = 0;
		double yearAv = 0;
		
		System.out.println("Welcome to the monthly temp tracker!");
		System.out.println("You will need to enter one full year of average monthly temperatures");
		for (int i = 0; i < 12; i++) {
			System.out.println("Enter the average temperature for " + months[i] + ":");
			avTemps[i] = scnr.nextFloat();
			yearAv += avTemps[i];
			if (i == 0){
				min = avTemps[i];
				max = avTemps[i];
			}else if (avTemps[i] > max){
				max = avTemps[i];
			}else if (avTemps[i] < min) {
				min = avTemps[i];
			}
		}
		yearAv = yearAv / 12;
		
		for (String input = ""; !(input.equals("exit")||input.equals("Exit")) ; ) {
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println("To view a month's average temperature, type the number of the month");
			System.out.println("To view a full year review, type the word 'Year'");
			System.out.println("To exit, type 'Exit'");
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			input = scnr.next();
			switch (input) {
			case "1":
				System.out.println("> The average temperature for " + months[0] + " was: " + avTemps[0]);
				break;
			case "2":
				System.out.println("> The average temperature for " + months[1] + " was: " + avTemps[1]);
				break;
			case "3":
				System.out.println("> The average temperature for " + months[2] + " was: " + avTemps[2]);
				break;
			case "4":
				System.out.println("> The average temperature for " + months[3] + " was: " + avTemps[3]);
				break;
			case "5":
				System.out.println("> The average temperature for " + months[4] + " was: " + avTemps[4]);
				break;
			case "6":
				System.out.println("> The average temperature for " + months[5] + " was: " + avTemps[5]);
				break;
			case "7":
				System.out.println("> The average temperature for " + months[6] + " was: " + avTemps[6]);
				break;
			case "8":
				System.out.println("> The average temperature for " + months[7] + " was: " + avTemps[7]);
				break;
			case "9":
				System.out.println("> The average temperature for " + months[8] + " was: " + avTemps[8]);
				break;
			case "10":
				System.out.println("> The average temperature for " + months[9] + " was: " + avTemps[9]);
				break;
			case "11":
				System.out.println("> The average temperature for " + months[10] + " was: " + avTemps[10]);
				break;
			case "12":
				System.out.println("> The average temperature for " + months[11] + " was: " + avTemps[11]);
				break;
			case "Year":
				System.out.println("Full year review:");
				for (int i = 0; i < 12; i++) {
					System.out.println("> " + months[i] + " average temperature: " + avTemps[i]);
				}
				System.out.println("The average temperature for the year was: " + yearAv);
				System.out.println("Highest monthly average: " + max);
				System.out.println("Lowest monthly average: " + min);
				break;
			case "year":
				System.out.println("Full year review:");
				for (int i = 0; i < 12; i++) {
					System.out.println("> " + months[i] + " average temperature: " + avTemps[i]);
				}
				System.out.println("The average temperature for the year was: " + yearAv);
				System.out.println("Highest monthly average: " + max);
				System.out.println("Lowest monthly average: " + min);
				break;
			default:
				input = "exit";
				break;
			}
		}
		
		System.out.println("Thank you for using the monthly temp tracker!");
		
		scnr.close();
	}

}
