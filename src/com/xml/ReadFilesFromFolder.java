package com.xml;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFilesFromFolder {

	public static void main(String argv[]) throws IOException   
	{  
		try (Stream<Path> paths = Files.walk(Paths.get("C:\\Users\\91939\\Softwares\\Files"))) {
		    paths
		        .filter(Files::isRegularFile)
		        .forEach(System.out::println);
		}
	}
}
