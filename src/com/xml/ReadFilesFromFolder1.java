package com.xml;

import java.io.File;

public class ReadFilesFromFolder1 {

	public static void main(String[] args) {
	
		final File folder = new File("C:\\Users\\91939\\Softwares\\Files");
		listFilesForFolder(folder);
	}
	
	public static void listFilesForFolder(final File folder) {
	    for (final File file : folder.listFiles()) {
	        if (!file.isDirectory()) {
	        	 System.out.println(file.getName());
	        }
	    }
	}
	
}
