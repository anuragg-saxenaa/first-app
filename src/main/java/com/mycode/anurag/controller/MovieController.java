package com.mycode.anurag.controller;

import com.mycode.anurag.domain.Movie;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anura on 2017-02-17.
 */
@RestController
@RequestMapping(value = "/api/v1/movies/")
public class MovieController {


   @RequestMapping(value = "/")
    List<Movie> getAllMovies(){
    return getMovies();
    }

    @RequestMapping(value = "/{name}")
    List<Movie> getMoviesByName(@PathVariable String name){
         List<Movie> m  = new ArrayList<Movie>();
          getMovies().forEach( movieName->{
            if(movieName.getName().equals(name)){
                m.add(movieName);
            }
        });

          return m;
    }

   private List<Movie> getMovies(){
        List<Movie> movies = new ArrayList<Movie>();
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();
        Movie movie4 = new Movie();

       movie1.setGenre("Drama");
       movie1.setName("Taxi Driver");
       movie1.setYear("1976");
       movie1.setLang("Eng");


       movie2.setGenre("Thriller");
       movie2.setName("Seven");
       movie2.setYear("1995");
       movie2.setLang("Eng");

       movie3.setGenre("Thriller");
       movie3.setName("Inception");
       movie3.setYear("2010");
       movie3.setLang("Eng");

       movie4.setGenre("Thriller");
       movie4.setName("XYZ");
       movie4.setYear("1995");
       movie4.setLang("Others");

       movies.add(movie1);
       movies.add(movie2);
       movies.add(movie3);
       movies.add(movie4);
    return movies;

   }
}
