package hospitalcharges;

import java.util.Scanner;

public class HospitalCharges {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		String stayOvernight;
		String askForAnotherPatient;
		double labServiceCharges;
		double medicationCharges;
		double overnightCharges;
		double hospitalCharges;

        do {
    		System.out.println("Do you want to stay overnight ? Y/N");
    		stayOvernight = in.next();
    		if (stayOvernight.toLowerCase() == "Y") {
    			System.out.println("What are your overnight charges ?");
    			overnightCharges = in.nextDouble();
    			System.out.println("What are your labservice charges ?");
    			labServiceCharges = in.nextDouble();
    			System.out.println("What are your medications charges ?");
    			medicationCharges = in.nextDouble();
    			hospitalCharges = labServiceCharges + medicationCharges + overnightCharges;
    			System.out.printf("You complete bil is $%5.2f", hospitalCharges);
    			System.out.println("");
    		} else {

    		}
		} while (askForAnotherPatient.toLowerCase() == "N");



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
		System.out.printf("You complete bil is $%5.2f", hospitalCharges);
		System.out.println("");
		System.out.println("Is any other patient? Y/N");
		askAnotherPerson = in.next();
		return askAnotherPerson;
	}
}
