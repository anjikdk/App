package com.test2;

public class Student implements Comparable<Student>{

	private String name;
	private Integer rollNum;
	private double totalMarks;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getTotalMarks() {
		return totalMarks;
	}
	public void setTotalMarks(double totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
	
	public Integer getRollNum() {
		return rollNum;
	}
	public void setRollNum(Integer rollNum) {
		this.rollNum = rollNum;
	}
	@Override
	public int compareTo(Student o) {
		
		if(o.name.compareTo(this.name) == 0)
		{
			return (int) (o.totalMarks - this.totalMarks);
		}
		else
			return o.name.compareTo(this.name);
			
		
	}
	
//	// name and joining date
//	
//	List<Employee> empList = findByNameOrderByJoiningDateDesc(String name);
//	
//	isNull
//	get
//	IfNullable
//	
//	Optional<Employee> emp = findById(Integer id);
	
	// LRU
	
	
	
	
	
	public int getStudent(Integer i)
	{
		return i == null ? i : i*i;
	}
	
	
	
	
}
