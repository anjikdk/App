package com.test;

import java.util.Random;
import java.util.stream.Stream;

public class I {

	public static void main(String[] args)
    {
        Stream<Integer> randomNumbers = Stream
            .generate(() -> (new Random()).nextInt(1000));

        randomNumbers.limit(20)
             .forEach(System.out::println);
    }
}
