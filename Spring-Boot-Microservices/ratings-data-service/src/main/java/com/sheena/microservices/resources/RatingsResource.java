package com.sheena.microservices.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sheena.microservices.models.Rating;
import com.sheena.microservices.models.UserRating;

@RestController
@RequestMapping("/ratingsData")
public class RatingsResource {
	/*
	@RequestMapping("/{movieId}")
	public Rating getRating(@PathVariable String movieId)
	{
		return new Rating(movieId,4);
	}
	*/
	@RequestMapping("users/{userId}")
	public UserRating getRating(@PathVariable("userId") String userId)
	{
		List<Rating> ratings = Arrays.asList(
				new Rating("1"+userId,4),
				new Rating("2"+userId,5)
			);
		//created UserRating class bcoz we can't return a list
		UserRating userRating=new UserRating();
		userRating.setUserRating(ratings);
		return userRating;
		
	}
}
