
public interface MyQueue<E> { 
	
	boolean addMovie(E object);
	E clearAll();
	boolean isEmpty();
	E peekMovie();
	E pushMovie(E e);
	E removeMovie(E e);
	int size();
}