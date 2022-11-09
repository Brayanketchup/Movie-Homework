
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class filemanager {
		// TODO Auto-generated method stub
		static ArrayList<movie> readMovieArray(String file) {
			ArrayList<movie> moviesArr = new ArrayList<>();
			try {
				Scanner csvReader = new Scanner(new File(file));
				csvReader.nextLine(); 
				
				while (csvReader.hasNext()) {
					String row = csvReader.nextLine();
					String[] data = row.split(",");
					
					int id = Integer.parseInt(data[0].trim());
					String name = data[1].trim();
					int year = Integer.parseInt(data[2].trim());
					double rating = Double.parseDouble(data[3].trim());
					int views = Integer.parseInt(data[4].trim());

					movie movie = new movie(id, name, year, rating, views);
					moviesArr.add(movie);
				}
				csvReader.close();

			} catch (FileNotFoundException f) {
				System.out.println("File not Found");
			}
			return moviesArr;
		}
	

	static List<movie> readMovieList(String file) {
		List<movie> movieslist = new ArrayList<>();

		try {
			Scanner csvReader = new Scanner(new File(file));
			csvReader.nextLine(); 
			while (csvReader.hasNext()) {
				String row = csvReader.nextLine();
				String[] data = row.split(",");

				int id = Integer.parseInt(data[0].trim());
				String name = data[1].trim();
				int year = Integer.parseInt(data[2].trim());
				double rating = Double.parseDouble(data[3].trim());
				int views = Integer.parseInt(data[4].trim());

				movie movie = new movie(id, name, year, rating, views);
				movieslist.add(movie);
			}
			csvReader.close();

		} catch (FileNotFoundException f) {
			System.out.println("File not Found");
		}
		return movieslist;
	}
	}

