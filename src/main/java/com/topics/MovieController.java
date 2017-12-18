package com.topics;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

	@Autowired
	private MovieService movieService;
	
	@RequestMapping("/movies")
	public List<Movie> getAllMovies() {
		return movieService.getAllMovies();
	}
	
	@RequestMapping("/movies/{id}")
	public Movie getMovieById(@PathVariable int id) {
		return movieService.getMovie(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/movies")
	public void addMovie(@RequestBody Movie movie) {
		movieService.add(movie);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/movies/{id}")
	public void updateMovieDetails(@RequestBody Movie movie,@PathVariable int id) {
		movieService.update(id, movie);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/movies/{id}")
	public void deleteMovie(@PathVariable int id) {
		movieService.delete(id);
	}
}
