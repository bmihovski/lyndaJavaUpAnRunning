package hospitalcharges;

import java.util.Scanner;

public class HospitalCharges {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String stayOvernight;
		String askForAnotherPatient;
		double labServiceCharges = 0;
		double medicationCharges = 0;
		double overnightCharges = 0;

        do {
    		System.out.println("Do you want to stay overnight ? Y/N");
    		stayOvernight = in.next();
    		if (stayOvernight.equalsIgnoreCase("y")) {
    			askForAnotherPatient = calculateCharges(in, labServiceCharges,
    					medicationCharges, overnightCharges);
    		} else {
    			askForAnotherPatient = calculateCharges(in, labServiceCharges, medicationCharges);

    		}
		} while (askForAnotherPatient.equalsIgnoreCase("y"));



	}

	public static String calculateCharges(Scanner in, double labCharges, double medicationCharges, double overnightCharges) {
		double hospitalCharges;
		String askAnotherPerson;
		System.out.println("What are your overnight charges ?");
		overnightCharges = in.nextDouble();
		System.out.println("What are your labservice charges ?");
		labCharges = in.nextDouble();
		System.out.println("What are your medications charges ?");
		medicationCharges = in.nextDouble();
		hospitalCharges = labCharges + medicationCharges + overnightCharges;
		printReceipt(hospitalCharges);
		askAnotherPerson = in.next();
		return askAnotherPerson;
	}

	public static String calculateCharges(Scanner in, double labCharges, double medicationCharges) {
		Double hospitalCharges;
		String askAnotherPerson;
		System.out.println("What are your labservice charges ?");
		labCharges = in.nextDouble();
		System.out.println("What are your medications charges ?");
		medicationCharges = in.nextDouble();
		hospitalCharges = labCharges + medicationCharges;
		printReceipt(hospitalCharges);
		askAnotherPerson = in.next();
		return askAnotherPerson;
	}

	public static void printReceipt(double hospitalCharges) {
		System.out.printf("You complete bil is $%6.2f", hospitalCharges);
		System.out.println();
		System.out.println("Is any other patient? Y/N");
	}
}
