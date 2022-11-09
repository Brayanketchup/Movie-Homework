
public class movie {
	//variables for constructors
	int ID;
	int Views;
	double rating;
	int year;
	private String Name;
	
	//Constructors
	public movie(){}
//	values[0]id, values[1]name , values[2]year , values[3]rate 
	public movie(int ID,String Name, int year, double rating, int Views){
		this.ID = ID;
		this.Views = Views;
		this.rating = rating;
		this.year = year;
		this.Name = Name;
	}
	
//setters
	public void setID(int movieID) {
		this.ID = movieID;
}

	public void setNumberOfViews(int NumbOfViews) {
		this.Views = NumbOfViews;
}

	public void setRating(int rating) {
		this.rating = rating;
}
	public void setReleaseDate(int releaseDate) {
		this.year = releaseDate;
}
	public void set(String movieName) {
		this.Name = movieName;
}

// getters
	public int getID(){
		return ID;
}
	public int getNumberOfViews(){
		return Views;
}
	public double getRating(){
		return rating;
}
	public int getReleaseYear(){
		return year;
}
	public String getName() {
		return Name;
}
//to String
	public String toString() {
		return "\nThe movie is called: " + "'" + Name + "'" + " It was released in " + year + "." +
				"\nThis movie's rating is: " + rating + " It has a total of: " + Views + " views." + 
				"\nID is: " + ID + ".";
	}
}
