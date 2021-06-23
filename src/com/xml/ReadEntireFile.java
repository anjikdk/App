package com.xml;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadEntireFile {

	public static void main(String argv[])   
	{  
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;		
		try
		{  
			file = new File("C:\\Users\\91939\\Softwares\\Files\\cls_students.xml");  
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
		}
		catch (Exception e) {
			e.printStackTrace();
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
