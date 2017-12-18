package com.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MovieService {

	private static List<Movie> movies = new ArrayList(Arrays.asList(
			new Movie(1,"Thor", "Thor: Ragnarok", "October,2017", "Chris Hemsworth", 10000000),
			new Movie(2,"Avengers", "Avengers: Infinity WAr", "October,2018", "Chris Hemsworth, Chris Evans", 40000000),
			new Movie(3,"Captian America", "Captian America: Civil War", "October,2016", "Chris Evans, Robert Downey", 30000000)
			));
	
	public List<Movie> getAllMovies() {
		return movies;
	}
	
	public Movie getMovie(int id) {
		return movies.stream().filter((movie) -> movie.getId() == id).findFirst().get();
	}

	public void add(Movie movie) {
		movies.add(movie);
	}

	public void update(int id, Movie movie) {
		for(int i=0;i<movies.size();i++) {
			Movie m = movies.get(i);
			if(m.getId() == (id)) {
				movies.set(i, movie);
				return;
			}
		}
		
	}

	public void delete(int id) {
		movies.removeIf(m -> m.getId() == id);
		
	}
	
}
