package moviesdata;

public class Movie {
	private String name;
	private String movieRating;
	private int movieYear;
	private int movieRuntime;

	public Movie() {}

	public String toString() {
		return "Your movie is: " + getName() +
				"\nYour movie rating is: " + getMovieRating() +
				"\nYour movie year is: " + getMovieYear() +
				"\nYour movie runtime is: " + getMovieRuntime();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMovieRating() {
		return movieRating;
	}

	public void setMovieRating(String movieRating) {
		this.movieRating = movieRating;
	}

	public int getMovieYear() {
		return movieYear;
	}

	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}

	public int getMovieRuntime() {
		return movieRuntime;
	}

	public void setMovieRuntime(int movieRuntime) {
		this.movieRuntime = movieRuntime;
	}

}
