
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class display<E> {

	public static void main(String[] args) throws IOException {
	
		/*IMPORTANT: anything in comments are teacher's instructions*/
		
		// values[0]id, values[1]name , values[2]year , values[3]rate, views
		String path = "C:\\Users\\15516\\OneDrive\\Desktop\\movies.txt";
		
		/*Implement 2 readData() methods : the first one will return an array of Movies and 
the second one will return a List of movies */
		ArrayList<movie> moviesArray = filemanager.readMovieArray(path);
		List<movie> moviesList = filemanager.readMovieList(path);
		
		//test methods
		System.out.println(moviesArray.toString());
		System.out.println(moviesList.toString());

		searchByYear(2010, moviesArray);
		searchByRate(5, moviesArray);
		System.out.println(compareYear(17,25,moviesArray));
		System.out.println(compareRate(12,32,moviesList));
		
		System.out.println(moviesList.get(12));
		System.out.println(moviesArray.get(32));
		
}

		public static void searchByYear(int year, ArrayList<movie> moviesArray ) {
	
			System.out.println("This Movie my interest you: ");
		for(movie movie : moviesArray) 	
			if (movie.year >= year) 
				System.out.println(movie);
			
		System.out.println("done searching!!");			
	}
		
		public static void searchByRate(double rate, List<movie> moviesList) {
			
			System.out.println("This movie might interest you: ");
			for (movie movie : moviesList)
				if(movie.getRating() > rate)
					System.out.println(movie);
				
			System.out.println("done searching!!");
		}
		
 /*  Implement two MovieComparators to compare movies by their rating from unsorted 
array and by year (first) and a rating (second)  from unsorted List. */
//	compare by year array
//  compare by rating list
		
		public static String compareYear(int index1, int index2, ArrayList<movie> moviesArray) {
			movie movie1 = moviesArray.get(index1);
			movie movie2 = moviesArray.get(index2);

			if (movie1.getReleaseYear() > movie2.getReleaseYear()) {
			return "'" + movie1.getName() + "'" + " Was release more resently";
			}
			return "'" +movie2.getName() + "'" + " Was release more resently";
			
		}

		public static String compareRate(int index1, int index2, List<movie> moviesList) {
			movie movie1 = moviesList.get(index1);
			movie movie2 = moviesList.get(index2);

			if (movie1.getRating() > movie2.getRating()) {
			return "'" + movie1.getName() + "'" + " Has better rating";
			}
			return "'" +movie2.getName() + "'" + " Has better rating";
			
		}
}