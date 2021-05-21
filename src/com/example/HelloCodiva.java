
package com.example;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
class HelloCodiva {

	public static String lastUniqueWord(String sentence)
	{
		String s = null;
		String str[] = sentence.split(" ");
		List<String> uniqueList = new ArrayList<>();
		List<String> duplicateList = new ArrayList<>();
		for(int i=0; i<str.length; i++)
		{
			boolean duplicate = false;
			for(int j=i+1; j<str.length; j++)
			{
				if(str[i].equalsIgnoreCase(str[j]))
				{
					duplicate = true;
					break;
				}
			}
			if(!duplicate && !duplicateList.contains(str[i]))
			{
				uniqueList.add(str[i]);
			}
			else
			{
				duplicateList.add(str[i]);
			}
		}
		if(uniqueList != null && uniqueList.size() != 0) 
		{
			s = uniqueList.get(uniqueList.size()-2);
		}
		System.out.println(uniqueList);
		
		return s;
	}
	
	public static String lastUniqueWord1(String sentence)
	{
		String str[] = sentence.split(" ");
		Set<String> uniqueSet = new HashSet<>();
		List<String> uniqueList = new ArrayList<>();
		for(int i=0; i<str.length; i++)
		{
			if(!uniqueSet.add(str[i]))
			{
				uniqueList.add(str[i]);
			}
			else
			{
				
			}
		}
		System.out.println(uniqueList);
		
		return uniqueList.get(uniqueList.size()-1);
	}


	public static void main (String[]args)
	{
		String sentence =  "The high mortality of medical practitioners in the region's two most populous countries shows the challenge they face combating the pandemic with testing and health-care systems lagging neighbors such as Singapore neighbors";

		String lastUniqueWord =lastUniqueWord1(sentence);

		System.out.println (lastUniqueWord);
	}

}
