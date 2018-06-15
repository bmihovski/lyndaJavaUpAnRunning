package dataconversion;

public class DataConversion {

	public static void main(String[] args) {
		double volume = 4/3 * Math.PI * 10 * 10 * 10;
		double realVolume = 4/3.0 * Math.PI * 10 * 10 * 10;
		System.out.println("The volume of a sphere with radius 10 is: " + volume);
		System.out.println("The real volume of a sphere with radius 10 is: " + realVolume);
		double fahrenheit = 500;
		double celsius = (fahrenheit - 32) * (5/9.0);
		System.out.println("Celsius is: " + celsius);

	}

}
