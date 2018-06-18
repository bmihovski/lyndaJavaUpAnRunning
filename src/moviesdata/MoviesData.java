package moviesdata;

import java.util.Scanner;

public class MoviesData {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Movie myMovie = new Movie();
		System.out.println("What is your favourite movie: ");
		myMovie.setName(in.nextLine());
		System.out.println("What is the movie rating: ");
		myMovie.setMovieRating(in.nextLine());
		System.out.println("What is the movie runtime: ");
		myMovie.setMovieRuntime(in.nextInt());
		System.out.println("What is the movie year: ");
		myMovie.setMovieYear(in.nextInt());
		System.out.println(myMovie.toString());
	}

}
