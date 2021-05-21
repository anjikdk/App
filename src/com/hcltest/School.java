package com.hcltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class School {

	public static void main(String[] args) {
		
		School s = new School();
		List<Student> students = s.createStudents();
		
		System.out.println(s.findStudentNameWithHistorySubject(students));
		System.out.println(s.findSubjects(students));
	}
	
	public List<Student> createStudents()
	{
		List<String> std1Subjects = Arrays.asList("English", "Science", "History");
		Student s1 = new Student("Rohit", std1Subjects);
		
		List<String> std2Subjects = Arrays.asList("English", "Science", "Mathematics");
		Student s2 = new Student("Rahul", std2Subjects);
		
		List<String> std3Subjects = Arrays.asList("English", "Hindhi", "History");
		Student s3 = new Student("Rak", std3Subjects);
		
		List<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		return students;
	}
	
	// Use case#1
	public List<String> findStudentNameWithHistorySubject(List<Student> students)
	{
		return students.stream().filter(s -> s.getSubjects().contains("History")).map(s -> s.getName()).collect(Collectors.toList());
	}
	
	// Use case#2
	public List<String> findSubjects(List<Student> students)
	{
		return students.stream().map(s -> s.getSubjects()).flatMap(List::stream).map(s -> s).distinct().collect(Collectors.toList());
	}
}
