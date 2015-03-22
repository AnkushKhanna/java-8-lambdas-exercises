package com.insightfullogic.java8.exercises.chapter5;

import com.insightfullogic.java8.examples.chapter1.Artist;
import com.insightfullogic.java8.exercises.Exercises;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;

public class LongestName {

	public static Artist byReduce(List<Artist> artists) {
		return artists.stream().max(Comparator.comparing(artist -> artist.getName().length())).get();

	}

	public static Artist byCollecting(List<Artist> artists) {
		Function<Artist, Integer> getCount = artist -> artist.getName().length();
		return artists.stream().collect(maxBy(comparing(getCount))).get();
	}

}
