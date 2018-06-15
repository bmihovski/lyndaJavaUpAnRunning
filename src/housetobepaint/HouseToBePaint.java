package housetobepaint;

import java.util.Scanner;

public class HouseToBePaint {

	public static void main(String[] args) {
		int areaToBePaint, lenght, width, height;
		int windowsCount, windowWidth, windowHeight;
		int doorsCount, doorWidth, doorHeight;

		Scanner in = new Scanner(System.in);

		System.out.println("What is your house lenght? :");
		lenght = in.nextInt();
		System.out.println("What is your house width? :");
		width = in.nextInt();
		System.out.println("What is your house height? :");
		height = in.nextInt();
		System.out.println("How many windows you have? :");
		windowsCount = in.nextInt();
		System.out.println("What is the width of your window? :");
		windowWidth = in.nextInt();
		System.out.println("What is the height of your window? :");
		windowHeight = in.nextInt();
		System.out.println("How many doors you have? :");
		doorsCount = in.nextInt();
		System.out.println("What is the width of your door? :");
		doorWidth = in.nextInt();
		System.out.println("What is the height of your door");
		doorHeight = in.nextInt();

		areaToBePaint = ((lenght * height * 2) + (width * height *2)) - (windowsCount * (windowWidth * windowHeight))
				- (doorsCount * (doorHeight * doorWidth));
		System.out.println("Total area to be paint = " + areaToBePaint);


	}

}
