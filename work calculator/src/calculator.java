import java.util.Scanner;
public class calculator {
	static double cashIntake;
	static int deliveryNo;
	static double extras;
	static double amountOwed1;
	static double amountOwed2;
	static double amountOwed3;
	static double workAm;
	static double totalIntake;
	static double petrolCost;
	static double hours;
	static double totalWage;
	static double profit1;
	static String answer;
	static Scanner input = new Scanner(System.in);
	static String answer2;
	public static void main(String[]args) {
		System.out.print("please enter '1' if you would like to calculate amount owed to work, "
				+ "please enter '2' if you would like to calculate profit: ");
		answer = input.next();
		if(answer.equals("1")) {
			input();
		}
		if(answer.equals("2")) {
			profit();
		}
	}
	public static void input() {
		System.out.print("please enter the cash delivery total: ");
		cashIntake = input.nextDouble();
		System.out.print("Please enter your number of deliveries: ");
		deliveryNo = input.nextInt();
		System.out.print("Please enter your extras amount: ");
		extras = input.nextDouble();
		amountOwed1 = cashIntake - (deliveryNo * 1.75);
		amountOwed2 = amountOwed1 - extras;
		amountOwed3 = amountOwed2 + 3;
		output();
	}
	public static void output() {
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("You will owe " + "€" + amountOwed3 + " to work when cashing out");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.print("would you like to calculate your profit?: ");
		answer2 = input.next();
		if(answer2.equals("yes")) {
			profit();
		}
		if(answer2.equals("no")){
			systemClose();
		}
		}
		
	public static void profit() {
		System.out.print("Please enter the total amount in wallet after payment: ");
		totalIntake = input.nextDouble();
		System.out.print("please enter petrol cost: ");
		petrolCost = input.nextDouble();
		System.out.print("Please enter the amount of hours worked: ");
		hours = input.nextDouble();
		totalWage = hours * 4.3;
		profit1 = totalIntake + totalWage - petrolCost;
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("your profit is €" + profit1);
		System.out.println("***************************");
		System.out.println("***************************");
		System.out.println("***************************");
		perHour();
		
		
	}
	public static void perHour() {
		double hourAmt = profit1 / hours;
		System.out.println("you made " + hourAmt + " per hour today");
		systemClose();
	}
	public static void systemClose() {
		System.out.print("Type 1 if you would like to restart this program, type 0 if you want to close it: ");
		int decision = input.nextInt();
		if(decision == 1) {
			input();
		}
		else if(decision == 0) {
			System.exit(0);
		}
		

	}
	}

