package com.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadXMLFilesFromFolderAndInsertIntoDB {

	public static void main(String[] args) {
		
		String fileOrFolder = args[0];
//		String fileOrFolder = "C:\\Users\\91939\\Softwares\\Files";
		if(fileOrFolder.endsWith(".xml"))
		{
			File file = new File(fileOrFolder);
			readDataAndInsertIntoDB(file);
		}
		else
		{
			File folder = new File(fileOrFolder);
			listFilesForFolder(folder);
		}
		
	}
	
	public static void listFilesForFolder(final File folder) {
		
	    for (final File file : folder.listFiles()) {
	    	// Read if and only if file extension is xml format
	        if (!file.isDirectory() && file.getAbsolutePath().endsWith(".xml")) {
	        	readDataAndInsertIntoDB(file);
	        }
	    }
	}
	
	public static void readDataAndInsertIntoDB(File file)
	{
		FileReader fr = null;
		BufferedReader br = null;
		try
 		{  
 			fr = new FileReader(file);
 			br = new BufferedReader(fr);
 			StringBuilder sb = new StringBuilder();
 			String s = "";
 			while( (s=br.readLine()) != null)
 			{
 				sb.append(s);
 				sb.append("\n");
 			}
 			
 			System.out.println(sb);
 			// Here insert Data into DB
 		}
 		catch (Exception e) {
 			e.printStackTrace();
 			// Insert Exception details into error description column in case any Exception occurred
 		}
 		finally
 		{
 			try {
 				if(br != null)
 					br.close();
 				if(fr != null)
 					fr.close();
 			} catch (IOException e) {
 				e.printStackTrace();
 			}
 		}
	}
}
