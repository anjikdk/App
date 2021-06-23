package com.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class E {

	public static void main(String[] args) throws IOException {
		
		Path path = Files.writeString(Files.createTempFile("test", ".txt"), "This is a txt file");
		
		String s = Files.readString(path);
		System.out.println(s);
	}
}
